import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCaculatorServlet",urlPatterns = "/caculator")
public class ProductDiscountCaculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("description");
        float listPrice = Float.parseFloat(request.getParameter("price"));
        float discountPercent= Float.parseFloat(request.getParameter("discount_percent"))/100;
        float discoutAmount= listPrice*discountPercent;
        float discountPrice= listPrice- discoutAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2>");
        writer.println("Product Description:"+productDescription);
        writer.println("<br/>");
        writer.println("Price:"+listPrice);
        writer.println("<br/>");
        writer.println("Discount Percent:"+(discountPercent*100)+"%");
        writer.println("<br/>");
        writer.println("Discount Amount:"+discoutAmount);
        writer.println("<br/>");
        writer.println("Discount Price:"+discountPrice);
        writer.println("<br/>");
        writer.println("</h2>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
