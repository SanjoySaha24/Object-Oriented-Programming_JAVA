//import java.io.*;
//import shape.*;
import shape.Figure;


public class Volume extends shape.Figure{
public static void main(String[] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
 int x,y,z;
System.out.println("Ellipsoid");
x=Integer.parseInt(br.readLine());
y=Integer.parseInt(br.readLine());
z=Integer.parseInt(br.readLine());
 Figure ep=new Volume();
ep.getVolume(x,y,z);

System.out.println("Cylinder");
x=Integer.parseInt(br.readLine());
y=Integer.parseInt(br.readLine());
Figure cy=new Volume();
cy.getVolume(x,y);

System.out.println("Cube");
x=Integer.parseInt(br.readLine());
Figure cu=new Volume();
cu.getVolume(x);
}}


