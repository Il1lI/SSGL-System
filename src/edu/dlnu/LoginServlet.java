package edu.dlnu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Connection connection = JdbcUtils.getConnection();
            PreparedStatement st = connection.prepareStatement("select * from user_teacher;");
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                String Tusername = resultSet.getString(1);
                String Tpassword = resultSet.getString(2);

                if (username == Tusername && password == Tpassword) {
                    request.getRequestDispatcher("/WEB-INF/pages/home.jsp").forward(request, response);
                } else {
                    request.setAttribute("msg","用户名或密码不对");
                    request.getRequestDispatcher("/WEB-INF/pages/loginview.jsp").forward(request, response);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
