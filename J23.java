import java.util.ArrayList;
public class J23{
    public static void main(String[] args){
	ArrayList<String> prisons=new ArrayList<>();
	for(int i=0;i<10;i++){
	    prisons.add("C");}
	System.out.println(prisons);

	for(int i=0;i<10;i++){
	    prisons.set(i,"O");}
	System.out.println(prisons+ "- Round"+1);

	for(int i=1;i<10;i=i+2){
	    prisons.set(i,"C");}	
	System.out.println(prisons+ "- Round"+2);
	for(int j=2;j<10;j=j+1){
	    for(int i=j;i<10;i=i+j+1){
	        if(prisons.get(i)=="C"){
		    prisons.set(i,"O");}
	        else{
		    prisons.set(i,"C");}}
	    System.out.println(prisons+ "- Round"+(j+1));}
	for(int i=0;i<10;i++){
	    if(prisons.get(i)=="O"){
		System.out.println("prisoner "+(i+1)+" is lucky");}}
    }
}