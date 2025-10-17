import java.util.Random;

public class J30{
   public static void main(String[] args){
      int rand1=0;
      Random rd = new Random();
      for(int i=0;i<10;i++){
         rand1=rd.nextInt(1000,9999);
         System.out.println(rand1);
      }
   }
}

