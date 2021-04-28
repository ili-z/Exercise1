function submit(){
	var a=$("#a").val();
	var b=$("#b").val();
	

	var item = {
		"action":"Login",
		"a":a,
		"b":b
	};
	
	alert(item.action);
	//alert(contextPath);
	$.ajax({
		url : "http://localhost:8080/EasyToBuyNets/LoginServlet",
		method : "post",
		data : item
	});
}