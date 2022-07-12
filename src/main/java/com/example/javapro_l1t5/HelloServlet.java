package com.example.javapro_l1t5;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" " +
                "integrity=\"sh" + "a384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<div class='row nt-3 mt-3'>");
        out.println("<div class='col-4 mx-auto' style='border: 1px #d1d1d1 solid; border-radius:7px; padding-top:10px;'>");
        out.println("<form action='/result' method='get'>");
        out.println("<table class=\"table table-borderless\">");
        out.println("<tr>");
        out.println("<td>FULL NAME:</td>");
        out.println("<td><input type='text' name='user_name' style='width:245px;'></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>AGE:</td>");
        out.println("<td><input type='number' name='user_age' style='width:245px;'></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>GENDER:</td>");
        out.println("<td> <input type='radio' name='gender' value='male'><label>Male</label><br><input type='radio' name='gender' value='female'><label>Female</label></td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td></td>");
        out.println("<td style='text-align:right;'><button style='border:1px solid grey;'>SEND</button></td>");
        out.println("</table>");
        out.println("</form>");
        out.println("</div></div>");
        out.println("</body></html>");

    }
}