package cn.parent.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.utils.PrintUtil;

import cn.utils.EmptyUtils;

import java.lang.reflect.Method;

public abstract class ParentServlet extends HttpServlet {
	
	public abstract Class getServletClass();
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Method method=null;
		Object result=null;
		String action=request.getParameter("action");
		System.out.println(action);
		try {
			if(EmptyUtils.isEmpty(action)) {
				result = execute(request, response);
			} else {
				method = getServletClass().getDeclaredMethod(action, HttpServletRequest.class, HttpServletResponse.class);
				result = method.invoke(this,request,response);
				System.out.println("2.mothod:"+method+"\nresult:"+result);
			}
			toView(request, response, result);
		} catch (NoSuchMethodException e) {
			String viewName = "404.jsp";
			request.getRequestDispatcher(viewName).forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	protected void toView(HttpServletRequest req, HttpServletResponse resp, Object result) throws IOException, ServletException {
		if (!EmptyUtils.isEmpty(result)) {
			if (result instanceof String) {
				String viewName = result.toString() + ".jsp";
				System.out.println("3.viewName:"+viewName);
				req.getRequestDispatcher(viewName).forward(req, resp);
			} else {
				System.out.println("PrintUtil.write:"+result);
				PrintUtil.write(result, resp);
			}
		}
	}
	
	public Object execute(HttpServletRequest req, HttpServletResponse resp) {
		return "index";
	}
}
