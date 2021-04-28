package cn.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.parent.servlet.ParentServlet;
import cn.pojo.EasybuyProduct;
import cn.service.ProductionService;
import cn.service.impl.ProductionService_Impl;
import cn.utils.ReturnResult;
import cn.utils.EmptyUtils;
import cn.utils.Factory;
import cn.utils.Pager;
@WebServlet("/ProductionServlet")
public class ProductionServlet extends ParentServlet {

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
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

//	商品管理分页显示记录
	public String ShowPages(HttpServletRequest request, HttpServletResponse response)
			throws Exception{
		String current = request.getParameter("currentPage");
		String rowPer = request.getParameter("rowPerPage");
		int currentPage = EmptyUtils.isEmpty(current)? 1 : Integer.parseInt(current);
		int rowPerPage = EmptyUtils.isEmpty(rowPer)? 5 : Integer.parseInt(rowPer);
		System.out.println(rowPerPage);
		System.out.println(currentPage);
		ProductionService production = Factory.getProductionService_Impl("ProductionService");
		int findTotalCount = production.findTotalCount();
		Pager pager = new Pager(findTotalCount, rowPerPage, currentPage);
		int pagecount = pager.getPageCount()%2==0? pager.getPageCount()/2 : pager.getPageCount()/2+1 ;
		List<EasybuyProduct> ProductAll = production.findEasybuyProductAll(pager);
		if(currentPage>pager.getPageCount()||currentPage<1){
			pager.setCurrentPage(1);
		} 
		System.out.println(request.getRequestURI());
		request.setAttribute("ProductAll", ProductAll);
		request.setAttribute("pagecount", pagecount);
		request.setAttribute("pager", pager);
		if(!EmptyUtils.isEmpty(ProductAll)){
			return "Production";
		}
		return "index";
	}
	
	@Override
	public Class getServletClass() {
		// TODO Auto-generated method stub
		return ProductionServlet.class;
	}

}
