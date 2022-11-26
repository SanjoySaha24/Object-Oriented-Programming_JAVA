public class Prime{
 public static void main(String[] args){
	int n=Integer.parseInt(args[0]);
	boolean flag=true;
	for(int i=2;i<n;i++){
	   if(n%i==0){
		flag=false;
		break;
	    }
		
	   }	
	if(flag){
			System.out.println("Prime");
		}
		else{
			System.out.println("Not Prime");	
		}
	}
}