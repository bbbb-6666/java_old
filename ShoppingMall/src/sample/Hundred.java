package sample;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class Hundred extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response)
                                       throws IOException, ServletException {
                 int total = 0;
                 for (int cnt = 1; cnt < 101; cnt++)
                 total += cnt;
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println( "<HEAD><TITLE>1부터 100까지 더하는 서블릿</TITLE></HEAD> ");
        out.println( "<BODY>");
        out.printf( "1부터 100까지의 합은 = %d ", total);
        out.println( "</BODY> ");
        out.println( "</HTML> ");
     }
}