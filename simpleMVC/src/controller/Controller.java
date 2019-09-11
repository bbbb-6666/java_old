package controller;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.UserDBBean;
import model.UserDataBean;

/**
 * Servlet implementation class Controller
 */
@WebServlet({ "/Controller", "/controller" })
public class Controller extends HttpServlet implements ControlInterface {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			requestPro(request, response);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			requestPro(request, response);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void requestPro(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		// TODO Auto-generated method stub
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");
		
		//생성자 추가
		//사용자가 입력창에서 입력한 걸 모델에 저장해줌
		UserDataBean user = new UserDataBean(firstname, lastname, email);
		UserDBBean user1 = new UserDBBean();
		user1.insertUser(user.getFirstname(), user.getLastname(), user.getEmail());
		
		// user값을 "user"에서 받아서 result-user로 넘겨줄것임
		request.setAttribute("user", user); 
		
		//모델에 저장한 값을 다시 result.jsp로 넘겨주려고 선언
		RequestDispatcher dp = request.getRequestDispatcher("result.jsp"); 
		
		//입력된 request값을 response에 넘겨줌
		dp.forward(request, response); 
		
	}

}
