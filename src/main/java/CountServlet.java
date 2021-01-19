import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        int hitCount;
        public void init() {
            hitCount = 0;
        }

        PrintWriter out = resp.getWriter();
        String title = "Total Number of Hits";
        int count = 0;
        for(int i = 1; i > count; i++){
            count = i;

        }

        out.println("<h1>" + count +"</h1");


    }
}
