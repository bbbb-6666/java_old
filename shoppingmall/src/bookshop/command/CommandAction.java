package bookshop.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandAction {
	public String requestPro(HttpServletRequest request, HttpServletResponse reponse)
	throws Throwable;
}
