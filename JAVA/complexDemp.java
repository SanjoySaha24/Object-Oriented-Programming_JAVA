import java.io.*;
class complex {
int real,imaginary;
complex ()  {
real = 5 ; imaginary= 10;
}
complex (int real, int imaginary){ 
this.real = real;
this.imaginary= imaginary;
}
complex (complex ob) {
this.real = ob.real + 8;
this.imaginary = ob.imaginary + 16;
}
complex add (complex ob1) {
int realans= real + ob1.real;
int imaginaryans = imaginary + ob1.imaginary;
complex ans = new complex(realans,imaginaryans);
return ans ;
}
complex sub (complex ob1) {
    int realans= real - ob1.real;
    int imaginaryans = imaginary - ob1.imaginary;
    complex ans = new complex(realans,imaginaryans);
    return ans ;
}
complex multi (complex ob1)
{
int realans =(real*ob1.real)- (imaginary*ob1.imaginary);
int imaginaryans =(real*ob1.real)+ (imaginary*ob1.imaginary);
complex ans=new complex(realans,imaginaryans);
return ans; }
}
public class complexDemo {
public static void main (String args[]) throws IOException {
    System.out.println ("Choose The Type of Operation") ;
    System.out.println ("1.Usind Default constructor") ;
    System.out.println ("2.Usind Normal constructor") ;
    System.out.println ("3.Usind object constructor") ;
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    String choice= br.readLine();
    if(choice.compareTo("1")==0){
        
complex ob = new complex ();
complex ob1 = new complex ();
complex comob=new complex();
complex comob1=new complex();
complex sumans = comob.add(comob1);
if(sumans.imaginary<0){
System.out.println (" Addition : " +sumans.real+ " + " +sumans.imaginary+"i");
}
else{
    System.out.println (" Addition : " +sumans.real+ " + " +sumans.imaginary+"i");
}
complex subans = comob.sub(comob1);
if(subans.imaginary<0){
System.out.println (" Substraction : " +subans.real+ " + " +subans.imaginary+"i");
}
else{
    System.out.println (" Substraction : " +subans.real+ " + " +subans.imaginary+"i");
}
complex multians = comob.multi(comob1);
if(multians.imaginary<0){
System.out.println (" Mutliplication : " +multians.real+ " + " +multians.imaginary+"i");
}
else{
    System.out.println (" Mutliplication : " +multians.real+ " + " +multians.imaginary+"i");
}
}
if(choice.compareTo("2")==0){

    System.out.println ("Enter the real and imaginary numbers of 1st complex number");
int real1=Integer.parseInt(br.readLine());
int img1 =Integer.parseInt(br.readLine());
System.out.println ("Enter the real and imaginary numbers of 2nd complex number");
int real2=Integer.parseInt(br.readLine());
int img2 =Integer.parseInt(br.readLine());
complex comob = new complex(real1,img1);
complex comob1 = new complex(real2,img2);
complex sumans= comob.add(comob1);
if(sumans.imaginary<0){
    System.out.println (" Addition : " +sumans.real+ " + " +sumans.imaginary+"i");
}
else{
    System.out.println (" Addition : " +sumans.real+ " + " +sumans.imaginary+"i");
}
complex subans = comob.sub(comob1);
if(subans.imaginary<0){
System.out.println (" Substraction : " +subans.real+ " + " +subans.imaginary+"i");
}
else{
    System.out.println (" Substraction : " +subans.real+ " + " +subans.imaginary+"i");
}
complex multians = comob.multi(comob1);
if(multians.imaginary<0){
System.out.println (" Mutliplication : " +multians.real+ " + " +multians.imaginary+"i");
}
else{
    System.out.println (" Mutliplication : " +multians.real+ " + " +multians.imaginary+"i");
}
}
else if(choice.compareTo("3")==0){

    System.out.println ("Enter the real and imaginary numbers of 1st complex number");
int real1=Integer.parseInt(br.readLine());
int img1 =Integer.parseInt(br.readLine());
System.out.println ("Enter the real and imaginary numbers of 2nd complex number");
int real2=Integer.parseInt(br.readLine());
int img2 =Integer.parseInt(br.readLine());
complex newob = new complex(real1,img1);
complex newob1 = new complex(real2,img2);
complex comob = new complex(newob);
complex comob1 = new complex(newob1);
complex sumans= comob.add(comob1);
if(sumans.imaginary<0){
    System.out.println (" Addition : " +sumans.real+ " + " +sumans.imaginary+"i");
}
else{
    System.out.println (" Addition : " +sumans.real+ " + " +sumans.imaginary+"i");
}
complex subans = comob.sub(comob1);
if(subans.imaginary<0){
System.out.println (" Substraction : " +subans.real+ " + " +subans.imaginary+"i");
}
else{
    System.out.println (" Substraction : " +subans.real+ " + " +subans.imaginary+"i");
}
complex multians = comob.multi(comob1);
if(multians.imaginary<0){
System.out.println (" Mutliplication : " +multians.real+ " + " +multians.imaginary+"i");
}
else{
    System.out.println (" Mutliplication : " +multians.real+ " + " +multians.imaginary+"i");
}
}
}}