/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import serveur.Etudiant;
import serveur.EtudiantFacadeLocal;

/**
 *
 * @author HIGH TECH
 */
@WebServlet(urlPatterns = {"/resultat"})
public class resultat extends HttpServlet {
  @EJB
  
private EtudiantFacadeLocal Etudefacade;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet resultat</title>");    
             
                  out.println("  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">");;
                       out.println("</head>");
            
            out.println("<body>");
                out.println("<br><br>");
                out.println("<a href='index.jsp'><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"50\" height=\"50\" fill=\"black\" class=\"bi bi-arrow-left-circle-fill\" viewBox=\"0 0 16 16\">\n" +
"  <path d=\"M8 0a8 8 0 1 0 0 16A8 8 0 0 0 8 0zm3.5 7.5a.5.5 0 0 1 0 1H5.707l2.147 2.146a.5.5 0 0 1-.708.708l-3-3a.5.5 0 0 1 0-.708l3-3a.5.5 0 1 1 .708.708L5.707 7.5H11.5z\"/>\n" +
"</svg> </a>");
                  out.println("<br><br>");
                 out.println("<br><br>");
                   out.println("<h2>Moyenne Etudiant</h2>");
                 
            out.println("  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>");
              out.println("<table class=\"table\">");
            out.println("<tr>");
                 out.println("  <th>Nom</th>\n" +
"    <th scope=\"col\">Prénom</th>\n" +
"    <th scope=\"col\">Module 1</th>\n" +
"    <th scope=\"col\">Module 2</th>\n" +
"    <th scope=\"col\">Module 3</th>\n" +
"     <th scope=\"col\">Moyenne</th>");
       out.println("</tr>");
       
                
List<Etudiant> etudiants = Etudefacade.findAll();
for (Etudiant etudiant : etudiants) {

   
                  out.println("<tr>");
           out.println("<td>");   
              out.println(etudiant.getNom());
           out.println("</td>");
             out.println("<td>");   
              out.println(etudiant.getPrénom());
           out.println("</td>");
           
                   out.println("<td>");   
              out.println(etudiant.getMat1());
           out.println("</td>");
           
           
                     out.println("<td>");   
              out.println(etudiant.getMat2());
           out.println("</td>");
           
                    out.println("<td>");   
              out.println(etudiant.getMat3());
           out.println("</td>");
           
                     out.println("<td>");   
              out.println((etudiant.getMat3()+etudiant.getMat2()+etudiant.getMat1())/3);
           out.println("</td>");
           
             out.println("</tr>");
           
             
    }
             out.println("</table>");
           
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
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
        processRequest(request, response);
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
        processRequest(request, response);
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
