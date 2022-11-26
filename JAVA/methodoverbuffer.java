import java.io.*;

class vol{
    double v;
    int a,b,c;
    void volume(int a)
    {
        this.a=a;
         v=a*a*a;
    System.out.println("Volume : "+v);
    }
     void volume ( int a, int b){
        this.a=a;
        this.b=b;
         v=3.14*a*a*b;
    System.out.println("Volume : "+v);
    }
    
     void volume ( int a, int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
     v=(4/3)*a*b*c;
    System.out.println("Volume : "+v);
    }
}
public class methodoverbuffer{
public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int x,y,z;
System.out.println("Ellipsoid");
x=Integer.parseInt(br.readLine());
y=Integer.parseInt(br.readLine());
z=Integer.parseInt(br.readLine());
 vol ep=new vol();
ep.volume(x,y,z);

System.out.println("Cylinder");
x=Integer.parseInt(br.readLine());
y=Integer.parseInt(br.readLine());
vol cy=new vol();
cy.volume(x,y);

System.out.println("Cube");
x=Integer.parseInt(br.readLine());
vol cu=new vol();
cu.volume(x);
}}


