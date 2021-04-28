<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- 商品管理分页功能 -->
<div class="pages">
<!-- 首页 -->
	<c:if test="${pager.currentPage!=1}">
		<a id="Home" href="javascript:void(0);" onclick="aclick(1);">First
		</a>
	</c:if>
<!-- 上一页 -->
	<c:if test="${pager.currentPage-1!=0}">
		<a id="up"
			href="javascript:void(0);"  onclick="aclick(${pager.currentPage-1});"><<
		</a>
	</c:if>
	
<!-- 动态按钮 -->
	<c:if test="${pager.currentPage<5}">
		<c:forEach var="page" begin="1" end="9">
			<a id="A${page}"
				href="javascript:void(0);" onclick="aclick(${page});">${page}
		</a>
		</c:forEach>
	</c:if>
	<c:if test="${pager.currentPage>=5}">
		<c:forEach var="page"
			begin="${pager.currentPage>5?pager.currentPage-5+1:1}"
			end="${pager.pageCount-pager.currentPage>4?pager.currentPage+4:pager.pageCount}">
			<a id="A${page}"
				href="javascript:void(0);" onclick="aclick(${page});">${page}
			</a>
		</c:forEach>
	</c:if>
<!-- 下一页 -->
	<c:if test="${pager.currentPage+1<pager.pageCount}">
		<a id="Down"
			href="javascript:void(0);" onclick="aclick(${pager.currentPage+1});">>>
		</a>
	</c:if>
<!-- 尾页 -->
	<c:if test="${pager.currentPage!=pager.pageCount}">
		<a id="End"
			href="javascript:void(0);" onclick="aclick(${pager.pageCount});">End
		</a>
	</c:if>
<!-- 无记录 -->
	<c:if test="${pager.pageCount==0}">
        暂无记录
    </c:if>
<!-- 当前页面 -->
	<input type="hidden" class="now" value="${pager.currentPage} ">
    <script type="text/javascript">
    var now = $(".now").val();
    $("#A"+now).css({"background-color":"skyblue","color":"#FFF","border": "1px solid skyblue"});
    </script>
</div>