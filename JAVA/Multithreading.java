import java.io.*;
class Fibonacci implements Runnable{
    int num;Thread t;
    Fibonacci(int n){
        t=new Thread(this);
        num=n;
        t.start();
    }
    public void run(){
        int tab[] =new int[num];
        tab[0]=0;
        tab[1]=1;
        try {
            for (int i = 0; i < num; i++) {
                if (i>=2) {
                    tab[i]=tab[i-1]+tab[i-2];
                }
                System.out.println((i+1)+"th fibonacci : "+tab[i]);
                t.sleep(1000);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

class Prime implements Runnable{
    Thread t;
    int lowBound,highBound;
    Prime(int low,int high){
        t=new Thread(this);
        lowBound=low;
        highBound=high;
        t.start();
    }
    public void run(){
        try {
            for (int i = lowBound; i <= highBound; i++) {
                int flag=0;
                for (int j = 2; j < i/2; j++) {
                    if (i%j==0) {
                        flag=1;
                        break;
                    }
                }
                if (flag==0) {
                    System.out.println("Prime number : "+i);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
public class Multithreading {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of N for fibonacci series : ");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter lower bound for prime number : ");
        int low=Integer.parseInt(br.readLine());
        System.out.println("Enter higher bound for prime number : ");
        int high=Integer.parseInt(br.readLine());

        Fibonacci obj1=new Fibonacci(n);
        Prime obj2=new Prime(low, high);
        try {
            obj1.t.join();
            obj2.t.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
