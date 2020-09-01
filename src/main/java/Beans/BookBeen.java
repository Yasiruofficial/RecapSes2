package Beans;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DBConnection;

public class BookBeen implements Serializable {

    private String Name;
    private String author;
    private String description;
    private float uprice;

    public BookBeen() {
        this.Name = "UnKnown";
        this.author = "UnKnown";
        this.description = "UnKnown";
        this.uprice = 0.0f;
    }

    public BookBeen(String name, String author, String description, float uprice) {
        this.Name = name;
        this.author = author;
        this.description = description;
        this.uprice = uprice;
    }
    
        public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getUprice() {
        return uprice;
    }

    public void setUprice(float uprice) {
        this.uprice = uprice;
    }
    
    public void addBook() {
        
        try {
            
            Connection con = DBConnection.getConnection();
            PreparedStatement stmt;
            stmt = con.prepareStatement("INSERT INTO book(name,author,description,uprice) values(?,?,?,?)");
            stmt.setString(1,Name);
            stmt.setString(2, author);
            stmt.setString(3, description);
            stmt.setFloat(4, uprice);
            
            stmt.executeUpdate();

            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(BookBeen.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public ResultSet addToCart(String name) {
        
        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement stmt = con.prepareStatement("SELECT * FROM book WHERE name=?");
            stmt.setString(1,name);
            ResultSet rs = stmt.executeQuery();
            
            con.close();
            
            return rs;   


        } catch (SQLException throwables) {

            throwables.printStackTrace();

        }
        return null;
            
    }
 
}
