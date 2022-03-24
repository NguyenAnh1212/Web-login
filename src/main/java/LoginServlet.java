import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        if (name.equals("Anh") && password.equals("123")){
            PrintWriter writer = response.getWriter();
            writer.println("Dang nhap thanh cong");
        }
        else{
            PrintWriter writer = response.getWriter();
            writer.println("Ten dang nhap hoac mat khau khong dung");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
