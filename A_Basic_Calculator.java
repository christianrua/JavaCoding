/*
A Basic Calculator

In this project, you will use classes, methods, and objects to create a simple arithmetic calculator. 
The calculator will be able to:

    Add two integers
    Subtract two integers
    Multiply two integers
    Divide two integers
    Apply the modulo operator on two integers

The instructions provided are general guidelines. Upon completion of the project, feel free to explore more in the learning 
environment.

Important: Moving forward, all projects will require that you define the main method manually. When you click the “Save” button 
below, an attempt to run your Java code is made. However, Java will return an error if you attempt to run a Java program without 
first defining a main method. If you encounter such an error, do not worry, you can define the main method ahead of time in order 
to avoid seeing the error.

*/

public class Calculator{
	public Calculator(){
    
  } 
  
  public int add(int a, int b){
  	int sum=a+b;
    return sum;
  }
  
  public int subtract(int a, int b){
    int dif=a-b;
    return dif;
  }
  
  public int multiply(int a, int b){
   int produc=a*b;
   return produc; 
  }
  
  public int divide(int a, int b){
  	int divi=a/b;
    return divi;
  }
  
  public int modulo(int a, int b){
  	int mod=a%b;
    return mod;
  }
  
  public static void main(String[] args){
   Calculator myCalculator=new Calculator();
   System.out.println(myCalculator.add(5,7));
  System.out.println(myCalculator.subtract(45,11)); 
  }
}
