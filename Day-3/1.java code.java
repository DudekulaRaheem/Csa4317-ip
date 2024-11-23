import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        // Get the name parameter from the request
        String name = request.getParameter("name");
        
        // Display the welcome message
        out.println("<html>");
        out.println("<head><title>Welcome Page</title></head>");
        out.println("<body>");
        if (name != null && !name.isEmpty()) {
            out.println("<h1>Welcome Page: " + name + "</h1>");
        } else {
            out.println("<h1>Welcome Page: Guest</h1>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}