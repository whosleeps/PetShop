package fire.petshop.loginandregist.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * ������:LogoutServlet
 * ����:�û���ҳ��ע��ʱ���ô�servlet
 * ��д:����
 * ��дʱ��:2006-11-28
 * ����޸�ʱ��:2006-12-1
 * 
 * */
public class LogoutServlet extends HttpServlet {

	 
	private static final long serialVersionUID = -5527278633054377059L;
 
	public LogoutServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
/**��������:destroy
*����:����servletʵ��,��Ҫ������������
*����:��
*����ֵ:void
*��дʱ��:2006-11-28
*����޸�ʱ��:2006-12-2
*/
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
/**��������:doGet
*����:����ҵ���ķ���
*����:request response
*����ֵ:void
*��дʱ��:2006-11-28
*����޸�ʱ��:2006-12-2
*/

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		if(request.getSession().getAttribute("userId") != null)
		{
			request.getSession().removeAttribute("userId");
		}
		
		request.setAttribute("flag", "logout");
		RequestDispatcher rd = request.getRequestDispatcher("../loginandregist/myaccount.jsp");
		rd.forward(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */

/**��������:goPost
*����:��doGet����
*����:request response
*����ֵ:void
*��дʱ��:2006-11-28
*����޸�ʱ��:2006-12-2
*/
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occure
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}