import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        String u = req.getParameter("uname");
        String p = req.getParameter("pass");

        if (u != null && p != null && u.equals("admin") && p.equals("123")) {
            RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
            rd.forward(req, res);
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("error.jsp");
            rd.forward(req, res);
        }
    }
}