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
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {
    
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
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");

    String nom = request.getParameter("nom");
    String prenom = request.getParameter("prenom");
    Float module1 =Float.parseFloat(request.getParameter("module1")) ;
    Float module2=Float.parseFloat(request.getParameter("module2")) ;
    Float module3 =Float.parseFloat(request.getParameter("module3")) ;
         
    
   
            out.print(nom);
            out.println(prenom);
       
            
            if(  nom!=null || prenom!=null ||  module1!=null ||  module2!=null || module3!=null  ){
                
           
            Etudiant e =new Etudiant();           
            e.setNom(nom);
            e.setPrénom(prenom);
            e.setMat1(module1);
            e.setMat2(module2);
            e.setMat3(module3);
            Etudefacade.create(e);
            
            
        
    
       
       response.sendRedirect("resultat");
            
          }
            
            
            else{
                                 
            out.println("il faut remplir les champs");
               out.println("remplir les champs svp");
                 response.sendRedirect("index.jsp");
            }
            
            
          

     

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
