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
            PreparedStatement st = connection.prepareStatement("select * from new_schema.user_teacher;");
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                String tusername = resultSet.getString(1);
                String tpassword = resultSet.getString(2);

                if (username.equals(tusername) && password.equals(tpassword)) {
                    request.getRequestDispatcher("/WEB-INF/pages/home.jsp").forward(request, response);
                } else {
                    request.setAttribute("msg","用户名或者密码不对！！！");
                    request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
