package Servlets;

import Beans.BookBeen;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/addBook")
public class addBook extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String name = request.getParameter("Name");
            String author = request.getParameter("author");
            String description = request.getParameter("des");
            String uprice = request.getParameter("uprice");

            BookBeen book = new BookBeen();
        
            book.setName(name);
            book.setAuthor(author);
            book.setDescription(description);
            book.setUprice(Float.parseFloat(uprice));

            book.addBook();
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
