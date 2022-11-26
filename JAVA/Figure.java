package shape;
public class Figure{
    int e,a,b;
    double vol;
public void getVolume(int e){
    this.e=e;
 vol=e*e*e;
System.out.println("Cube volume is : "+vol);}

public void getVolume(int e, int b){
    this.e=e;
    this.b=b;
 vol=3.14*e*e*b;
System.out.println("Cylinder volume is : "+vol);}

public void getVolume(int e,int b, int a){
    this.e=e;
    this.a=a;
    this.b=b;
 vol=e*a*b;
System.out.println("Rectangle volume is : "+vol);}}