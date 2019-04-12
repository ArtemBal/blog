package app.servlets;

import app.connection.DBConnectionManager;
import app.entities.Post;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/views/addPost.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String text = req.getParameter("text");
        String author = req.getParameter("author");
        Post post = new Post(author, name, text);

        Connection connection = DBConnectionManager.getDBConnection();
        try {
            Statement statement = connection.createStatement();

            statement.execute("INSERT INTO posts"
                    + "(Author, Title, PostText, Create_date) "
                    + "VALUES " + "('" +  author + "','" + name + "','" + text + "'," + "NOW()" + ")");

            req.setAttribute("postName", name);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        doGet(req, resp);
    }

    private String getCurrentTimeStamp() {
        return DateFormat.getDateInstance().format(DateFormat.LONG);
    }
}
