public class J28{
   public static void main(String[] args){
	double angle1=0.0;
	for(int j=0;j<12;j++){
	    for(int i=0;i<12;i++){
	        angle1=Math.abs(90-(j*30)+(i*30)-(i*2.5));
	        System.out.println(angle1%360);
	    }
	    System.out.println();
        }
   }
}

