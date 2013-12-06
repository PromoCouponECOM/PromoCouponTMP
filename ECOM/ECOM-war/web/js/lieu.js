function swichNameLieu(lieu, listeVille) {
	document.getElementById('nameLieu').innerHTML = lieu;
	listeVille = document.getElementById(listeVille);
	listeVille.style.visibility = "hidden";
	return false;
}

function toggleVisibility(listeVille)
{
   if(typeof listeVille == "string")
      listeVille = document.getElementById(listeVille);
   if(listeVille.style.visibility == "hidden")
      listeVille.style.visibility = "visible";
   else
      listeVille.style.visibility = "hidden";
}