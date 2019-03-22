
function doJqValidation(){
	
	var empid=$("#empid").val();
	var ename=$("#ename").val();
	
	if(empid==null|| empid==""){
		$("#errorMsg").text("Please Enter Employee Id");
		return false;
	}
	
	else if(ename==null || ename==""){
		$("#errorMsg").text("Please Enter Employee Name");
		return false;
	}
	
	
}