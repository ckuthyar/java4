import java.util.ArrayList;
public class J26{
    public static void main(String[] args){
	int count=100;
	ArrayList<String> prisons=new ArrayList<>();
	ArrayList<Integer> lucky=new ArrayList<>();
	for(int i=0;i<count;i++){
	    prisons.add("C");}

	for(int i=0;i<count;i++){
	    prisons.set(i,"O");}

	for(int i=1;i<count;i=i+2){
	    prisons.set(i,"C");}	
	
	for(int j=2;j<count;j=j+1){
	    for(int i=j;i<count;i=i+j+1){
	        if(prisons.get(i)=="C"){
		    prisons.set(i,"O");}
	        else{
		    prisons.set(i,"C");}}}

	for(int i=0;i<count;i++){
	    if(prisons.get(i)=="O"){
		lucky.add(i+1);}}
	System.out.println(lucky+" are the lucky prisoners");
    }
}