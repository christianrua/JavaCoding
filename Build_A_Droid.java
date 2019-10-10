/*
Build A Droid

We’ve set up a robot workshop to build some droids. All that’s missing are the instructions on how to create the robots and 
what they’ll do.

Can we write a Java class to help?

We’ll need to define the state and behavior of the droids using instance fields and methods. Let’s get to work!

*/

public class Droid{
  String name;
  int batteryLevel;
  
  public Droid(String droidName){
		name=droidName;
    batteryLevel=100;
  }
  
  public void performTask(String task){
    System.out.println(name +" is performing task: "+task);
   batteryLevel=batteryLevel-10; 
  }
  
  public void batteryLevel(){
    
  }
  
  public String toString(){
    return "Hello, I’m the droid: " + name;
  }
  public static void main(String[] args){
   Droid Codey=new Droid("Codey");  
   System.out.println(Codey.name); 
   Codey.performTask("dancing");
  }
}
