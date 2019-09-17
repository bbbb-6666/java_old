package controller;

import java.io.IOException;
import java.util.ArrayList;

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
@WebServlet("/controller")
public class Controller extends HttpServlet implements ControllInterface {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
    }


    
    @Override
	public void init() throws ServletException {
		System.out.println("init");
		super.init();
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		doPost(request, response);
	}


	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		try {
			requestPro(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	@Override
	public void requestPro(HttpServletRequest request, HttpServletResponse response) throws ServletException, Exception {
		
		request.setCharacterEncoding("UTF-8");

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String email = request.getParameter("email");

		//DAO에 파라미터 직접연결 -1번작업
		UserDBBean user = new UserDBBean();
		user.insertUser(firstname, lastname, email);
		
		//파라미터를 DTO에 접속 후 DAO에 전달하는 방법  --2번작업
//		UserDataBean user =  new UserDataBean(firstname,lastname,email);
//		UserDBBean user1 = new UserDBBean();
//		user1.insertUser(user.getFirstname(), user.getLastname(), user.getEmail());


		
		
//		ArrayList<UserDataBean> listDB = user1.list();  //2번작업시
		ArrayList<UserDataBean> listDB = user.list();  //1번작업시
		request.setAttribute("user", listDB);
		//attribute는 웹메모리 상에 저장되기 때문에 request에 저장됨
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
		
		dispatcher.forward(request, response);
		
		Controller controller = new Controller();
		controller.destroy();
	}


	@Override
	public void destroy() {
		System.out.println("destory");
		super.destroy();
	}

	
	
	
	
}
