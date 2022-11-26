import java.io.*;


interface vol{
    public void involume(double s1, double s2, double s3);
    public void outvolume(double s1, double s2, double s3);
    }
    class Result implements vol {
        public void involume(double s1, double s2, double s3) {
            double volume = (3.14 * s1 * s2 * s3) / 3;
            System.out.println("The inner volume is : " + volume);
        }

        public void outvolume(double s1, double s2, double s3) {
            double volume = (4*3.14 * s1 * s2 * s3) / 3;
            System.out.println("The outer volume is : " + volume);
        }
    }
    public class interfacevol {
        public static void main(String[] args)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Result res = new Result();
            double a,b,c,volume;
            System.out.println("Enter s1 of the machine");
            a = Double.parseDouble(br.readLine());
            System.out.println("Enter s1 of the machine");
            b = Double.parseDouble(br.readLine());
            System.out.println("Enter s1 of the machine");
            c = Double.parseDouble(br.readLine());
            res.involume(a,b,c);
            res.outvolume(a,b,c);
        }
    }