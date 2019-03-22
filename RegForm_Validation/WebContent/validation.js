function doValidation(){
	var Eid = document.getElementById("Eid").value;
	var firstName = document.getElementById("firstName").value;
	var middleName = document.getElementById("middleName").value;
	var lastName = document.getElementById("lastName").value;
	var dob = document.getElementById("dob").value;
	var gender = document.getElementById("gender").value;
	var phoneNumber= document.getElementById("phoneNumber").value;
	var emailId= document.getElementById("emailId").value;
   // var emailId = document.forms["form"]["Email"].value;
   //var gmail = /^([\w-\.]+@(?!gmail.com)(?!yahoo.com)(?!hotmail.com)([\w-]+\.)+[\w-]{2,4})?$/
	var pAddress = document.getElementById("pAddress").value;
	var city = document.getElementById("city").value;
	var state = document.getElementById("state").value;
	var country = document.getElementById("country").value;


	if(Eid==""|| Eid==null){
		alert("Please enter Employee Id");
		return false;
		}
		
	else if(firstName==""|| firstName==null){
		alert("Please enter First Name");
		return false;
		}

	else if(lastName==""|| lastName==null){
		alert("Please enter Last Name");
		return false;
		}
	
	else if(gender==0){
			alert("Please Select Gender");
			return false;
			}
	/*else if(maleid.checked==false&&femaleid.checked==false&&otherid==false ){
		alert("Please Select Gendr");
		return false;
		}*/
	
	else if(dob==""|| dob==null){
		alert("Please enter Date of Birth");
		return false;
		}
	
	else if(phoneNumber==""|| phoneNumber==null){
		alert("Please Enter Phone Number");
		return false;
		}
	
	else if(phoneNumber.length!=10){
		alert("Phone Number should contain 10 Digits");
		return false;
		}
	
	else if(emailId==""|| emailId==null){
		alert("Please enter Valid Mail Id");
		return false;
		}
	 /*else if(!gmail.test(emailId)){
         alert("Enter a valid email");
         return false;
         }*/
	 
	else if(pAddress==""|| pAddress==null){
			alert("Please enter Your Address");
			return false;
			}
		
	else if(city==0){
		alert("Please Select City");
		return false;
		}
	else if(state==0){
		alert("Please Select State");
		return false;
		}
	else if(country==0){
		alert("Please Select Country");
		return false;
		}
	 
	else{
		alert("Form Submitted Succesfully");
		return true;
	}
	
	
		
}