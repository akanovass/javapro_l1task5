package com.example.javapro_l1t5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/result")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String fullName = request.getParameter("user_name");
        int age = Integer.parseInt(request.getParameter("user_age"));
        String gender = request.getParameter("gender");

        String dude = "";
        String formal = "Miss";

        if(age < 18){
            dude = " Dude";
        }

        if("male".equals(gender)){
            formal = "Mister";
        }
        out.println("<h2>Hello" + dude +" " + formal +" " + fullName + "!</h2>");
    }
}
