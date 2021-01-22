import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="GuessLoseServlet", urlPatterns = "/incorrect")
public class GuessLoseServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String message = "Sorry you lost!";
        req.setAttribute("message", message);

        req.getRequestDispatcher("/guessing-game/guessoutcome.jsp").forward(req, res);


    }


}
