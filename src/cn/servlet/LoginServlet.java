package cn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.parent.servlet.ParentServlet;
import cn.pojo.EasybuyProductCategory;
import cn.service.Product_Category_Service;
import cn.service.impl.Product_Category_Service_Impl;
import cn.utils.Factory;
import cn.utils.ReturnResult;

@WebServlet("/LoginServlet")
public class LoginServlet extends ParentServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public String getProductCategoryList(HttpServletRequest request, HttpServletResponse response){
		Product_Category_Service pcs = Factory.getProduct_Category_Service_Impl("Product_Category_Service");
		System.out.println(Integer.parseInt(request.getParameter("id")));
		List<EasybuyProductCategory> productCategoryList1 = pcs.getProductCategoryList(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("product1", productCategoryList1);
		return "index";
	}
	
	public String getProductCategoryListOne(HttpServletRequest request, HttpServletResponse response){
		Product_Category_Service pcs = Factory.getProduct_Category_Service_Impl("Product_Category_Service");
		System.out.println("listone");
		List<EasybuyProductCategory> listOne = pcs.getProductCategoryListOne();
		System.out.println("GetProductCategoryListOne:"+listOne.size());
		request.setAttribute("listOne", listOne);
		return "index";
	}

	public ReturnResult Login(HttpServletRequest request, HttpServletResponse response){
		ReturnResult result = new ReturnResult();
		Product_Category_Service pcs = Factory.getProduct_Category_Service_Impl("Product_Category_Service");
		System.out.println("listone");
		List<EasybuyProductCategory> listOne = pcs.getProductCategoryListOne();
		System.out.println("GetProductCategoryListOne:"+listOne.size());
		request.setAttribute("listOne", listOne);
		return result.returnSuccess("µÇÂ¼³É¹¦£¡");
	}
	
	@Override
	public Class getServletClass() {
		return LoginServlet.class;
	}
}
