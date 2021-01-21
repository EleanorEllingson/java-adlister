import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name="PizzaOrderServlet", urlPatterns = "/pizzaorder")
public class PizzaOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/pizza-order/pizzaorder.jsp").forward(req, res);
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String crust = req.getParameter("crust");
        req.setAttribute("crust", crust);

        String sauce = req.getParameter("sauce");
        req.setAttribute("sauce", sauce);

        String size = req.getParameter("size");
        req.setAttribute("size", size);

        String address = req.getParameter("address");
        req.setAttribute("address", address);

        String[] toppings = req.getParameterValues("toppings");
        req.setAttribute("toppings", toppings);


        System.out.println("Crust: " + crust);
        System.out.println("Sauce: " + sauce);
        System.out.println("Size: " + size);
        for (int i = 0; i < toppings.length; i += 1){
            System.out.println("Toppings: " + toppings[i]);
        }
        System.out.println("Address: " + address);


        req.getRequestDispatcher("/pizza-order/pizzaorder.jsp").forward(req, res);

    }
}
