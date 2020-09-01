package Servlets;

import Beans.BookBeen;
import java.io.IOException;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addToCart")
public class addToCart extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String name = request.getParameter("Name");
            String qty = request.getParameter("qty");
            
            BookBeen book = new BookBeen();
            
            ResultSet rs = book.addToCart(name);
            
            request.setAttribute("ResultSet", rs);
            request.setAttribute("qty", qty);
            
            request.getRequestDispatcher("/display.jsp").forward(request, response);
            
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
