import java. io.*;

    class Demo {
        public static void main(String args[]) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the dividend:");
            int dividend = Integer.parseInt(br.readLine());
            System.out.println("Enter the divisor : ");
            int divisor = Integer.parseInt(br.readLine());
            int r = 0;
            try {
                r = dividend / divisor;
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                if (r == -9999) {
                    System.out.println("Exception occured.");
                } else {
                    System.out.println("The quotient is :" + r);
                }
            }
        }
    }