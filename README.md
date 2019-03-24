#Bill calculation

##Description

Using springboot, write a program that finds a bill's net payable amount using these rules:
1. If the user is an employee of the store, he gets a 30% discount
2. If the user is an affiliate of the store, he gets a 10% discount
3. If the user has been a customer for over 2 years, he gets a 5% discount.
4. For every $100 on the bill, there would be a $ 5 discount (e.g. for $ 990, you get $ 45
as a discount).
5. The percentage based discounts do not apply on groceries.
6. A user can get only one of the percentage based discounts on a bill.

###Installation:

* Clone repository
`> git clone https://github.com/AlainNem/code-challenge.git`

*Maven installation:
  -Download maven from : https://maven.apache.org/download.cgi
  -unzip the distribution archive in any directory
  -Add the bin directory of the created directory apache-maven-*version_level* to the PATH environment variable

* Navigate to the  project directory
`> cd code-challenge/code-challenge`
  -open a command line here
  -run the command "mvn compile"
  
* To run the tests:
  -run the command "mvn test" 
  -The result will indicate the number of tests applied, failures and errors
  
* Coverage report:
  -After running the command "mvn test"
  -Navigate threw the project directories to target/site/jacoco
  -open the index.html file and review the report
  
  
