Feature: Create Account Functionality for LeafTaps Application 

Scenario Outline: Create Account with Multiple data 

	And Click on Create Account 
	And Enter Account name <accountName> 
	And Enter description <desc> 
	And Enter number of employees <noOfEmp> 
	And Click Create Account button 
	Then verify Account Details tab open 
	
	Examples: 
		|accountName|desc|noOfEmp|
		|SBI|accountant|30|
		|ICICI|manager|40|
		|HDFC|cashier|50|
		
		
