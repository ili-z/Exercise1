$(document).ready(function() {
	change1();
});

function change1(){
	var item = {"action" : "getProductCategoryListOne"}; 
	$("#seleOne").load("LoginServlet #seleOne>*",item);
}
function change2(){
	seleTwo();
	$("#seleTwo").val(0);
	$(".san").remove();
}
function seleTwo(){
	var id = $("#seleOne").val();
	var item = {
			"action" : "getProductCategoryList",
			"id" :  id
	};
	$("#seleTwo").load("LoginServlet #seleTwo>*",item);
}

function change3(){
	seleThree();
}
function seleThree(){
	var id = $("#seleTwo").val();
	var item = {
			"action" : "getProductCategoryList",
			"id" :  id
	};
	$("#seleThree").load("LoginServlet #seleThree>*",item);
}
