import java.io.*;

class Employee{
    int empCode, phNo;
    double da=0.1, hrs=0.2;
    String empName, address;
    public Employee(String name, String add, int code, int num){
        empName = name;
        add = address;
        empCode = code;
        phNo = num;
    }
    public double calSalary(double bP){
        return (bP + (bP*da) + (bP*hrs));
    }
}

class Teaching extends Employee{
    String SubjectSpecializaton, Designation;
    public Teaching(String name, String add, int code, int num, String SubSpec, String Desi){
        super(name, add, code, num);
        SubjectSpecializaton = SubSpec;
        Designation = Desi;
    }
}

class Office extends Employee{
    String position;
    public Office(String name, String add, int code, int num, String pos){
        super(name, add, code, num);
        position = pos;
    }
}

class Faculty extends Teaching{
    String researchArea;
    double basicPay;
    public Faculty(String name, String add, int code, int num, String SubSpec, String Desi, String rA, double bp){
        super(name, add, code, num, SubSpec, Desi);
        researchArea = rA;
        basicPay = bp;
    }
}

class Technical extends Teaching{
    double basicPay;
    String techExpertArea;
    public Technical(String name, String add, int code, int num, String SubSpec, String Desi, double bp, String tEA){
        super(name, add, code, num, SubSpec, Desi);
        basicPay = bp;
        techExpertArea = tEA;
    }
}

class Administrative extends Office{
    double basicPay;
    public Administrative(String name, String add, int code, int num, String pos, double bp){
        super(name, add, code, num, pos);
        basicPay = bp;
    }
}

class Accounts extends Office{
    double basicPay;
    public Accounts(String name, String add, int code, int num, String pos, double bp){
        super(name, add, code, num, pos);
        basicPay = bp;
    }
}

public class Salcal {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the division as follows:\n" +
                "1. Faculty\n" +
                "2. Technical\n" +
                "3. Administrative\n" +
                "4. Accounts");
        int choice = Integer.parseInt(br.readLine());
        int code, num;
        double bp;
        String name, add, SubSpec, Desi, rA, tEA, pos;
        switch(choice){
            case 1:
                //Faculty


                System.out.println("Enter the Employee's name: ");
                name = br.readLine();
                System.out.println("Enter the Employee's address: ");
                add = br.readLine();
                System.out.println("Enter the Employee's Subject Specalization: ");
                SubSpec = br.readLine();
                System.out.println("Enter the Employee's code: ");
                code = Integer.parseInt(br.readLine());
                System.out.println("Enter the Employee's phone number: ");
                num = Integer.parseInt(br.readLine());
                System.out.println("Enter the Employee's designation: ");
                Desi = br.readLine();
                System.out.println("Enter the Employee's researh area: ");
                rA = br.readLine();
                System.out.println("Enter the Employee's basic pay: ");
                bp = Double.valueOf(br.readLine()).doubleValue();
                Faculty f1 = new Faculty(name, add, code, num, SubSpec, Desi, rA, bp);
                System.out.println("The name of the Employee is: "+ f1.empName);
                System.out.println("The code of the Employee is: "+ f1.empCode);
                System.out.println("The Salary of the Employee is: "+ f1.calSalary(f1.basicPay));
                break;
            case 2:
                //Technical
                //String name, String add, int code, int num, String SubSpec, String Desi, double bp, String tEA

                System.out.println("Enter the Employee's name: ");
                name = br.readLine();
                System.out.println("Enter the Employee's address: ");
                add = br.readLine();
                System.out.println("Enter the Employee's Subject Specalization: ");
                SubSpec = br.readLine();
                System.out.println("Enter the Employee's code: ");
                code = Integer.parseInt(br.readLine());
                System.out.println("Enter the Employee's phone number: ");
                num = Integer.parseInt(br.readLine());
                System.out.println("Enter the Employee's designation: ");
                Desi = br.readLine();
                System.out.println("Enter the Employee's Technical Expert Area: ");
                tEA = br.readLine();
                System.out.println("Enter the Employee's basic pay: ");
                bp = Double.valueOf(br.readLine()).doubleValue();
                Technical f2 = new Technical(name, add, code, num, SubSpec, Desi, bp, tEA);
                System.out.println("The name of the Employee is: "+ f2.empName);
                System.out.println("The code of the Employee is: "+ f2.empCode);
                System.out.println("The Salary of the Employee is: "+ f2.calSalary(f2.basicPay));
                break;
            case 3:
                //Admin
                //String name, String add, int code, int num, String pos, double bp
                System.out.println("Enter the Employee's name: ");
                name = br.readLine();
                System.out.println("Enter the Employee's address: ");
                add = br.readLine();
                System.out.println("Enter the Employee's code: ");
                code = Integer.parseInt(br.readLine());
                System.out.println("Enter the Employee's phone number: ");
                num = Integer.parseInt(br.readLine());
                System.out.println("Enter the Employee's position: ");
                pos = br.readLine();
                System.out.println("Enter the Employee's basic pay: ");
                bp = Double.valueOf(br.readLine()).doubleValue();
                Administrative f3 = new Administrative(name, add, code, num, pos, bp);
                System.out.println("The name of the Employee is: "+ f3.empName);
                System.out.println("The code of the Employee is: "+ f3.empCode);
                System.out.println("The Salary of the Employee is: "+ f3.calSalary(f3.basicPay));
                break;
            case 4:
                //Acc
                //String name, String add, int code, int num, String pos, double bp
                System.out.println("Enter the Employee's name: ");
                name = br.readLine();
                System.out.println("Enter the Employee's address: ");
                add = br.readLine();
                System.out.println("Enter the Employee's code: ");
                code = Integer.parseInt(br.readLine());
                System.out.println("Enter the Employee's phone number: ");
                num = Integer.parseInt(br.readLine());
                System.out.println("Enter the Employee's position: ");
                pos = br.readLine();
                System.out.println("Enter the Employee's basic pay: ");
                bp = Double.valueOf(br.readLine()).doubleValue();
                Accounts f4 = new Accounts(name, add, code, num, pos, bp);
                System.out.println("The name of the Employee is: "+ f4.empName);
                System.out.println("The code of the Employee is: "+ f4.empCode);
                System.out.println("The Salary of the Employee is: "+ f4.calSalary(f4.basicPay));
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}