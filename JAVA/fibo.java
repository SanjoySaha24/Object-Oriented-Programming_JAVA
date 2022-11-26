class fibo{

public static void main(String args[]){

int a= Integer.parseInt(args[0]);

if(a==1)
System.out.println(0);

else{
int n1=0,n2=1,n3;

        
        System.out.print(n1+" "+n2);
        
        for (int i=2;i<a;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

}


}}