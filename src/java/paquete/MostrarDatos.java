package paquete;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostrarDatos
 */
@WebServlet("/MostrarDatos")
public class MostrarDatos extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarDatos() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String codigoEmpleado = request.getParameter("CodigoEmpleado");
            String nombre = request.getParameter("Nombre");
            String apellido = request.getParameter("Apellido");
            String documento = request.getParameter("Documento");
            String correoElectronico = request.getParameter("CorreoElectronico");
            String cargo = request.getParameter("Cargo");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MostrarDatos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Datos del Empleado</h2>");
            out.println("<h3>Código Empleado: " + codigoEmpleado + "</h3>");
            out.println("<h3>Nombre: " + nombre + "</h3>");
            out.println("<h3>Apellido: " + apellido + "</h3>");
            out.println("<h3>Documento: " + documento + "</h3>");
            out.println("<h3>Correo Electrónico: " + correoElectronico + "</h3>");
            out.println("<h3>Cargo: " + cargo + "</h3>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
