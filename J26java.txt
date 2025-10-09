import java.util.ArrayList;
public class J25{
    public static void main(String[] args){
	int count=10;
	ArrayList<String> prisons=new ArrayList<>();
	ArrayList<Integer> lucky=new ArrayList<>();
	for(int i=0;i<count;i++){
	    prisons.add("C");}
	System.out.println(prisons);

	for(int i=0;i<count;i++){
	    prisons.set(i,"O");}
	System.out.println(prisons+ "- Round"+1);

	for(int i=1;i<count;i=i+2){
	    prisons.set(i,"C");}	
	System.out.println(prisons+ "- Round"+2);
	for(int j=2;j<count;j=j+1){
	    for(int i=j;i<count;i=i+j+1){
	        if(prisons.get(i)=="C"){
		    prisons.set(i,"O");}
	        else{
		    prisons.set(i,"C");}}
	    System.out.println(prisons+ "- Round"+(j+1));}
	for(int i=0;i<count;i++){
	    if(prisons.get(i)=="O"){
		lucky.add(i+1);}}
	System.out.println(lucky+" are the lucky prisoners");
    }
}