package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ExamServlet extends HttpServlet {
	
	/*
	 	http://localhost:9999/Lecture-web/servlet/exam
	 			?name=hong&hobby=reading&hobby=music&hobby=movie 입력시
	 	
	 	웹브라우저에 다음의 결과가 응답됨
	 	이름 : hong
	 	취미 : reading music movie
	 */

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String[] hobby = request.getParameterValues("hobby");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>서블릿연습</title></head>");
		out.println("<body>");
		out.println("	이름 : " + name + "<br>");
		out.println("	취미 : ");
		for(int i = 0; i < hobby.length; i++) {
			out.println(hobby[i] + "&nbsp;&nbsp;");
		}
		out.println("<br>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}






