class Circle{
double p;
int r;
Circle(int r){
this.r=r;
}
void peri1(){
p=3.14*r*r;
System.out.println("Perimeter of circle : "+p);
}
}

class Square{
int a;
Square(int a){
this.a=a;
}
void peri2(){
System.out.println("Perimeter of square : "+4*a);
}
}

class Rectangle{
int l,b;
Rectangle(int l,int b){
this.l=l;
this.b=b;
}
void peri3(){
System.out.println("Perimeter of rectangle : "+2*(l+b));
}
}

public class Peri{
public static void main(String[] args){
int l=args.length;
int i=0;
int x,y;
while(l!=i){
if(args[i].equalsIgnoreCase("rectangle")){
x=Integer.parseInt(args[i+1]);
y=Integer.parseInt(args[i+2]);
i=i+3;
Rectangle rec=new Rectangle(x,y);
rec.peri3();
}

else if(args[i].equalsIgnoreCase("circle")){
x=Integer.parseInt(args[i+1]);
i=i+2;
Circle circ=new Circle(x);
circ.peri1();
}

else if(args[i].equalsIgnoreCase("square")){
x=Integer.parseInt(args[i+1]);
i=i+2;
Square sq=new Square(x);
sq.peri2();
}
}
}
}