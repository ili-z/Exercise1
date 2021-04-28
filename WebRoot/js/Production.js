$(document).ready(function() {
	
});

function an(){
	var rowPerPage = $("#rowPerPage").val();
	var currentPage = $("#currentPage").val();
	var items={
			"action" : "ShowPages",
			"rowPerPage" : rowPerPage,
			"currentPage" : currentPage 
		};
	$.ajax({
		url : "/EasyToBuyNets/ProductionServlet",
		method : "post",
		data : items
	});
}
