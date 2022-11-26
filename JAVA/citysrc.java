import java.io.*;
class NoMatchFoundException extends Exception{
        String str;
        NoMatchFoundException (String city){
            str=city;
        }
        public String toString(){
            return str+" not found";
        }
}
        class Nomatchexception {
            public static void main(String args[]) throws IOException, NoMatchFoundException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int i;
                String arr[] = new String[50];
                for (i = 0; i < 5; i++) {
                    arr[i] = br.readLine();
                }
                try {
                    boolean flag = false;
                    System.out.println("Enter the city you want to search: ");
                    String city = br.readLine();
                    for (i = 0; i < 5; i++) {
                        if (city.equals(arr[i])) {

                            flag = true;
                            System.out.println(city + " is found");
                            break;
                        }
                    }
                    if (flag == false) {
                        throw new NoMatchFoundException(city);
                    }
                } catch (NoMatchFoundException e) {
                    System.out.println(e);
                }
            }
        }