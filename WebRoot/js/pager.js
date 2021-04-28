function aclick(page){
	var items = {
		"action" : 	"ShowPages",
		"currentPage" : page
	};
	$("#shang").load("/EasyToBuyNets/ProductionServlet",items);
};