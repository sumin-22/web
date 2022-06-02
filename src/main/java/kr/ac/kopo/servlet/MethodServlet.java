package kr.ac.kopo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MethodServlet extends HttpServlet {

	//http://localhost:9999/Lecture-web/method?id=kim
	//클라이언트가 입력한 것을 서버쪽에 전달. 서버에서는 사용자가 넘겨준 ID 추출.
	//request에 요청한 정보들이 들어있다. 요청 객체를 통해 ID를 추출하고 싶은것. ?뒤에 있는게 파라미터
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String method = request.getMethod();
		String uri = request.getRequestURI();
		//리턴타입 StringBuffer
		StringBuffer url = request.getRequestURL();
		//getParameter의 리턴타입 String
		String id = request.getParameter("id");
		
		//서버 쪽에 출력 
		System.out.println("요청 Method : " + method);
		System.out.println("요청 URI : "+ uri);
		System.out.println("요청 URL : " + url.toString());
		System.out.println("요청 ID : " + id);
	}

}
