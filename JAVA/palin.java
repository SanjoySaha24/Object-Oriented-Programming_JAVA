class palin{
public static void main(String args[]){

String s= args[0];
int l =s.length();
boolean flag=true;

for( int i=0; i<=l/2-1; i++ ){

if( s.charAt(i) ==  s.charAt(l-1) ){

 l--;
		flag= false;
break;  }
}
if(flag){
System.out.println("PALINDROME");}

else{

System.out.println("PALINDROME");}
}}