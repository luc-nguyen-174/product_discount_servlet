package com.example.product_discount_cal;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet", urlPatterns = "/display-discount")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String des = request.getParameter("product_des");
        float product_price = Float.parseFloat(request.getParameter("price"));
        float product_discount = Float.parseFloat(request.getParameter("discount"));

        float discount_amount = (float) (product_price * product_discount * 0.01);
        PrintWriter print = response.getWriter();

        print.println("<html>");

        print.println("<h2>Description: " + des + "</h1>");
        print.println("<h2>List Price: " + product_price + "vnd" + "</h>");
        print.println("<h2>Discount Percent: " + product_discount + "%" + "</h>");
        print.println("<h2>Discount Amount: " + discount_amount + "vnd" + "</h>");

        print.println("</html>");

    }
}
