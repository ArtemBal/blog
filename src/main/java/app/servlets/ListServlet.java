package app.servlets;

import app.connection.DBConnectionManager;
import app.model.ElementInList;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Connection connection = DBConnectionManager.getDBConnection();
        List<ElementInList> list = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT Author, Title from posts");
            while (resultSet.next()) {
                ElementInList element = new ElementInList();
                element.setAuthor(resultSet.getString(1));
                element.setTitle(resultSet.getString(2));
                list.add(element);
            }
            resultSet.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("postNames", list);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/views/viewList.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
