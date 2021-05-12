package ru;

import model.Model;
import user.User;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class GetIndexPageServlet extends HttpServlet {

    private static String index = "/WEB-INF/";





    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
//        int id = Integer.parseInt(req.getParameter("id"));
//        Model model = Model.getInstance();
//        Map<Integer, User> map = model.get();
//        if (!map.isEmpty()) {
//            User user = map.get(id);
//            req.setAttribute("user", user.toString());
//        }
       // req.getRequestDispatcher("bye.jsp").forward(req, resp);

        String[] arrRequest = req.getRequestURI().split("/");
        String request = arrRequest[arrRequest.length-1];
        req.getRequestDispatcher( index + request + ".jsp").forward(req, resp);
//        resp.sendRedirect(request + ".jsp");
//        //req.setAttribute();
    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        Model model  = Model.getInstance();
////        int id = Integer.parseInt(req.getParameter("id"));
////        String firstName = req.getParameter("firstName");
////        String lastName = req.getParameter("lastName");
////        int phone = Integer.parseInt("phone");
////        model.add(id,(new User(id, firstName, lastName, phone)));
//        req.getRequestDispatcher("hello.jsp").forward(req,resp);
//    }
}