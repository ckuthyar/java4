import java.util.ArrayList;
public class J19{
    public static void main(String[] args){
	ArrayList<String> prisons=new ArrayList<>();
	for(int i=0;i<10;i++){
	    prisons.add("C");}
	System.out.println(prisons);

	for(int i=0;i<10;i++){
	    prisons.set(i,"O");}
	System.out.println(prisons+ "- Round1");

	for(int i=1;i<10;i=i+2){
	    prisons.set(i,"C");}	
	System.out.println(prisons+ "- Round2");

	for(int i=2;i<10;i=i+3){
	    if(prisons.get(i)=="C"){
		prisons.set(i,"O");}
	    else{
		prisons.set(i,"C");}}
	System.out.println(prisons+ "- Round3");
	
  	for(int i=3;i<10;i=i+4){
	    if(prisons.get(i)=="C"){
		prisons.set(i,"O");}
	    else{
		prisons.set(i,"C");}}
	System.out.println(prisons+ "- Round4");
	
	for(int i=4;i<10;i=i+5){
	    if(prisons.get(i)=="C"){
		prisons.set(i,"O");}
	    else{
		prisons.set(i,"C");}}
	System.out.println(prisons+ "- Round5");
    }
}