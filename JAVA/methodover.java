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
public class methodover{
public static void main(String[] args){
int l=args.length;
int i=0;
int x,y,z;
while(l!=i){
if(args[i].equalsIgnoreCase("Ellip")){
x=Integer.parseInt(args[i+1]);
y=Integer.parseInt(args[i+2]);
z=Integer.parseInt(args[i+3]);
i=i+4;
 vol ep=new vol();
ep.volume(x,y,z);
}

else if(args[i].equalsIgnoreCase("cylinder")){
x=Integer.parseInt(args[i+1]);
y=Integer.parseInt(args[i+2]);
i=i+3;
vol cy=new vol();
cy.volume(x,y);
}

else if(args[i].equalsIgnoreCase("Cube")){
x=Integer.parseInt(args[i+1]);
i=i+2;
vol cu=new vol();
cu.volume(x);
}}}}


