/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mazetk
 */
@WebServlet(
        name = "ControllerServlet",
        loadOnStartup = 1,
        urlPatterns = {"/addToCart", "/updateCart", "/viewCart", "/login", "/logout", "/register", "/purchase"}
)
public class ControllerServlet extends HttpServlet {

    /*
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userPath = request.getServletPath();

        switch (userPath) {

            case "/addToCart":
                break;

            case "/updateCart":
                break;

            case "/viewCart":
                userPath = "/cart";
                break;

            case "/login":
                break;

            case "/logout":
                break;

            case "/register":
                break;

            case "/purchase":
                break;
        }

        // use RequestDispatcher to forward request internally
        String url = userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userPath = request.getServletPath();
        switch (userPath) {
            case "/addToCart":
                break;

            case "/updateCart":
                break;

            case "/viewCart":
                userPath = "/cart";
                break;

            case "/login":
                break;

            case "/logout":
                break;

            case "/register":
                break;

            case "/purchase":
                break;
        }
        
        // use RequestDispatcher to forward request internally
        String url = "/WEB-INF/view" + userPath + ".jsp";

        try {
            request.getRequestDispatcher(url).forward(request, response);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
