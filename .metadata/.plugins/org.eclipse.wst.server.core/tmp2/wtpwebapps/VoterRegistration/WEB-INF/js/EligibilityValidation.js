function eligibilityValidation(){
	
	var dob=document.getElementById("dob").value;
	
	if(dob==null||dob==""){
	document.getElementById("dob").innerHTML="Please select your Date of Birth";
	return false;
	}
		else{
		return true;
	}
}