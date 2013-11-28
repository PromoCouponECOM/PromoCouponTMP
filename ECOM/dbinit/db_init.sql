--drop table "Commande";
--drop table "Coupon";
--drop table "Livraison";
--drop table "Offre";
--drop table "Utilisateur";
--drop table "Entreprise";
--drop table "Adresse";
--drop table "Categorie";

create table "Categorie" (
		"idCateg" numeric (3), 
		"nomCateg" varchar(20),
		"dateModif" date,
		constraint "cat_p" primary key ("idCateg")    
) ; 

create table "Adresse" (
		"idAdresse" numeric (10),
		"numEtRue" varchar(100),
		"comple" varchar(100),
		"codePostale" char(5),
		"ville" varchar(35),
		"pays" varchar(35),
		"dateModif" date,
		constraint "a_p" primary key ("idAdresse")
) ; 

create table "Entreprise" (
		"idE" numeric(8),
		"nomE" varchar(30),
		"mailE" varchar(30),
		"passE" varchar(30),
		"telE" char(10),
		"adrE" numeric(10),
		"resuE" blob,
		"consulE" varchar(50),
		"validation" boolean,
		"siret" char(14),
		"rib" char(27),
		"dateModif" date,
		constraint "e_p" primary key ("idE"), 
		constraint "e_f" foreign key ("adrE") references "Adresse"("idAdresse")      
) ; 

create table "Utilisateur" (
		"idU" numeric (8),
		"mailU" varchar(20) unique, 
		"adrU" numeric (10),
		"telU" char(10),
		"passU" varchar(30),
		"nomU" varchar(30),
		"prenomU" varchar(30),
		"sexe" char(1),
		"dataModif" date,
		constraint "u_p" primary key ("idU"), 
		constraint "u_f" foreign key ("adrU") references "Adresse"("idAdresse")        
) ; 

create table "Offre" (
		"idO" numeric (10),
		"title" varchar(150),
		"prixOrigin" numeric (8,2),
		"prixActuel" numeric (8,2),
		"dateDebut" date,
		"dateFin" date,
		"dscription" blob,
		"idE" numeric(8),
		"image" blob,
		"categorie" numeric(3),
		"conseille" blob,
		"validation" boolean,
		"dateModif" date,
		"nbCoupons" numeric(4),
		"limite" numeric(2),
		constraint "o_p" primary key ("idO"), 
		constraint "o_f1" foreign key ("idE") references "Entreprise" ("idE"),
		constraint "o_f2" foreign key ("categorie") references "Categorie"("idCateg"),  
		constraint "o_c1" check ("dateDebut" < "dateFin"),
		constraint "o_c2" check ("prixOrigin" >= "prixActuel")
)  ; 


create table "Livraison" (
		"idL" numeric (10),
		"nomRecep" varchar(35),
		"prenomRecep" varchar(35),
		"telRecep" char(10),
		"adrRecep" numeric(10),
		constraint "l_p" primary key ("idL"),
		constraint "l_f" foreign key ("adrRecep") references "Adresse" ("idAdresse")
);

create table "Coupon" (
		"idCoupon" numeric (30),
		"idOffre" numeric (10),
		"reference" char(10),
		"status" numeric(1),
		"dateVente" date,
		constraint "coup_p" primary key ("idCoupon"), 
		constraint "coup_f" foreign key ("idOffre") references "Offre" ("idO")
) ; 

create table "Commande" (
		"idC" numeric (10),
		"idU" numeric (8),
		"idCoupon" numeric(30),
		"idLivraison" numeric(10),
		"msg_client" blob,
		"msg_entreprise" blob,
		"status" boolean,
		"momentC" timestamp,
		constraint "c_p" primary key ("idC"),
		constraint "c_f1" foreign key ("idU") references "Entreprise" ("idE"),
		constraint "c_f2" foreign key ("idCoupon") references "Coupon" ("idCoupon"),
		constraint "c_f3" foreign key ("idLivraison") references "Livraison" ("idL") 
) ; 



insert into "Adresse" values(4,'12 rue des chimie', '114', '38400', 'Grenoble', 'France','2013-11-1');
insert into "Adresse" values(1,'132 rue des université', 'APPT 1', '38400', 'saint martin dheres', 'France','2013-11-1');
insert into "Adresse" values(2,'120 rue des hugo', '405', '38400', 'Grenoble', 'France','2013-11-1');
insert into "Adresse" values(3,'124 rue des residences', 'etage 6', '38400', 'saint martin dheres', 'France','2013-11-1');



select * from "Categorie";
insert into "Categorie" values(4,'Voyage','2013-11-1');
insert into "Categorie" values(1,'Ticket','2013-11-1');
insert into "Categorie" values(2,'Restaurant','2013-11-1');
insert into "Categorie" values(3,'Informatique','2013-11-1');


select * from "Utilisateur";
INSERT INTO "Utilisateur" ("idU", "mailU", "adrU", "telU", "passU", "nomU", "prenomU", "sexe", "dataModif") 
	VALUES (3, 'aje@111.com', 1, '1111111111', 'user', 'Luc', 'alex', 'h', '2013-11-22');
INSERT INTO "Utilisateur" ("idU", "mailU", "adrU", "telU", "passU", "nomU", "prenomU", "sexe", "dataModif") 
            VALUES (1, 'aje@121.com', 2, '222222222', 'user', 'ANY', 'Y', 'f', '2013-11-22');
INSERT INTO "Utilisateur" ("idU", "mailU", "adrU", "telU", "passU", "nomU", "prenomU", "sexe", "dataModif") 
	VALUES (2, 'aje@131.com', 1, '3333333333', 'user', 'LULU', 'X', 'f', '2013-11-22');



select * from "Entreprise";
INSERT INTO "Entreprise" ("idE", "nomE", "mailE", "passE", "telE", "adrE", "resuE", "consulE", "validation", "siret", "rib", "dateModif") 
	VALUES (3, 'DE', 'WWW@gmail.com', 'entreprise', '1234567890', 3, NULL, 'HTC, Google', true, 'FR12345678', '12345678901234567', '2013-11-15');

INSERT INTO "Entreprise" ("idE", "nomE", "mailE", "passE", "telE", "adrE", "resuE", "consulE", "validation", "siret", "rib", "dateModif") 
	VALUES (1, 'DAE', 'EEE@gmail.com', 'entreprise', '1234567891', 1, NULL, 'APP', true, 'FR12345679', '12345678901234568', '2013-11-15');

INSERT INTO "Entreprise" ("idE", "nomE", "mailE", "passE", "telE", "adrE", "resuE", "consulE", "validation", "siret", "rib", "dateModif") 
	VALUES (2, 'DEF', 'FFFF@gmail.com', 'entreprise', '1234567892', 2, NULL, 'EXE', false, 'FR12345670', '12345678901234569', '2013-11-15');





INSERT INTO "Offre" ("idO", "title", "prixOrigin", "prixActuel", "dateDebut", "dateFin", "dscription", "idE", "image", "categorie", "conseille", "validation", "dateModif", "nbCoupons", "limite") 
	VALUES (3, 'Resto', 249, 199, '2013-11-09', '2013-11-23', NULL, 3, NULL, 3, NULL, true, '2013-11-21', 100, 5);
INSERT INTO "Offre" ("idO", "title", "prixOrigin", "prixActuel", "dateDebut", "dateFin", "dscription", "idE", "image", "categorie", "conseille", "validation", "dateModif", "nbCoupons", "limite") 
	VALUES (1, 'Rest1o', 200, 129, '2013-11-09', '2013-11-23', NULL, 1, NULL, 1, NULL, true, '2013-11-21', 100, 5);
INSERT INTO "Offre" ("idO", "title", "prixOrigin", "prixActuel", "dateDebut", "dateFin", "dscription", "idE", "image", "categorie", "conseille", "validation", "dateModif", "nbCoupons", "limite") 
	VALUES (2, 'Resto', 249, 199, '2013-11-09', '2013-11-23', NULL, 2, NULL, 2, NULL, true, '2013-11-21', 100, 5);






select * from "Coupon";
INSERT INTO "Coupon" ("idCoupon", "idOffre", "reference", "status", "dateVente") 
	VALUES (3, 1, 'ddddffff',2, '2013-11-14');
INSERT INTO "Coupon" ("idCoupon", "idOffre", "reference", "status", "dateVente") 
	VALUES (1, 1, 'ddddffff',2, '2013-11-14');
INSERT INTO "Coupon" ("idCoupon", "idOffre", "reference", "status", "dateVente") 
	VALUES (2, 2, 'ddddffff', 1, '2013-11-14');







INSERT INTO "Commande" ("idC", "idU", "idCoupon", "idLivraison", "msg_client", "msg_entreprise", "status", "momentC")
	VALUES (0, 0, 0, 0, NULL, NULL, true, '2013-11-21 16:55:07.299');
INSERT INTO "Commande" ("idC", "idU", "idCoupon", "idLivraison", "msg_client", "msg_entreprise", "status", "momentC")
	VALUES (1, 1, 1, 1, NULL, NULL, false, '2013-11-21 16:55:39.388');
INSERT INTO "Commande" ("idC", "idU", "idCoupon", "idLivraison", "msg_client", "msg_entreprise", "status", "momentC") 
	VALUES (2, 2, 2, 2, NULL, NULL, true, '2013-11-21 16:56:02.139');
