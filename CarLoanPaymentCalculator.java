/*
A Simple Car Loan Payment Calculator

Let’s combine a few of the concepts that you have learned so far: conditionals, Boolean expressions, and arithmethic expressions.

In this project, you will write a program that will calculate the monthly car payment a user should expect to make after taking 
out a car loan. The program will include the following:

    Car loan amount
    Interest rate of the loan
    Length of the loan (in years)
    Down payment

The instructions provided are general guidelines. Upon completion of the project, feel free to add functionality of your own.
*/

public class CarLoan {
  
	public static void main(String[] args) {
	int carLoan=10000;
  int loanLength=3;
  int downPayment=2000;
  int interestRate=5;
    
    if(loanLength<=0 || interestRate<=0){
    	System.out.println("Error! You must take out a valid car loan.");  
    }else if(downPayment>=carLoan){
     	System.out.println("The car can be paid in full."); 
    }else{
      int remainingBalance=carLoan-downPayment;
      int months=loanLength*12;
      int monthlyBalance=remainingBalance/months;
      int interest=(monthlyBalance*interestRate )/100;
      int monthlyPayment=monthlyBalance+interest;
      System.out.println(monthlyPayment);
    }
	

	}
}
