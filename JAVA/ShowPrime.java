public class ShowPrime{
	public static void main(String[] args){
	int lower=Integer.parseInt(args[0]);
	int upper=Integer.parseInt(args[1]);
	for(int i=lower;i<upper;i++){
	if(i==0 || i==1){
	continue;
}
	boolean flag=true;
	for(int j=2;j<i;j++){
	   if(i%j==0){
		flag=false;
		break;
	    }
		
	   }	
	if(flag){
			System.out.println(i);
		}
}
}
}