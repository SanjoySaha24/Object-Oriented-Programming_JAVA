public class City{
public static void main(String[] args){
String arr[];
int n=args.length;
arr=new String[n];
for(int i=0;i<n-1;i++){
 for(int u=0;u<n-1-i;u++){
  int p=args[u].compareTo(args[u+1]);
   if(p==0){
    for(int r=0;r<args[u].length();r++){
        if(args[u].charAt(r)>args[u+1].charAt(r)){
	 String temp=args[u];
	 args[u]=args[u+1];
	 args[u+1]=temp;
	 break;
}
}
}
else if(p>0){
	String temp=args[u];
	args[u]=args[u+1];
	args[u+1]=temp;
      }
}
}
for(int i=0;i<n;i++){
System.out.println(args[i]);
}
}
}

