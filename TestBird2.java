class Bird{
   String colour;
   public static void fly(){
      System.out.println("The bird flies"); }}

public class TestBird2{
   public static void main(String[] args){  
      Bird swan=new Bird();
      swan.colour="white";
      System.out.println(swan.colour);
      swan.fly();}}