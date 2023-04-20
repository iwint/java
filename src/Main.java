import java.util.Scanner;

class Instructor {
    int id;
    String name;
    String subject;
    String teacher;
    String department;

    Instructor(int id, String name, String subject, String teacher, String department) {
        System.out.println(
                "Enter Id  :\n" +
                        "Enter Name :\n" +
                        "Enter Subject Name :\n" +
                        "Enter Teacher Name :\n" +
                        "Enter Department Name :");
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.teacher = teacher;
        this.department = department;
    }

    void getDetails() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Subject Name : " + subject);
        System.out.println("Teacher Name : " + teacher);
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Enter No. of Instructor Details You Want :");
        int n = I.nextInt();
        Instructor[] iArr = new Instructor[n];
        for (int i = 0; i < n; i++) {
            int id = I.nextInt();
            String name = I.next();
            String subject = I.next();
            String teacher = I.next();
            String department = I.next();
            iArr[i] = new Instructor(id, name, subject, teacher, department);
        }

        for (int i = 0; i < n; i++) {
            iArr[i].getDetails();
        }
    }
}

class Payroll {
    int e_no;
    String e_name;
    String e_des;
    int bp;
    int hra;
    int da;
    int pf;
    int np;

    Payroll(int e_no, String e_name, String e_des, int bp, int hra, int da, int pf) {
        this.e_no = e_no;
        this.e_name = e_name;
        this.e_des = e_des;
        this.bp = bp;
        this.hra = hra;
        this.da = da;
        this.pf = pf;
        this.np = bp + da;
    }

    void getDetails() {
        System.out.println(e_no + " " + e_name + " " + e_des + " " + bp + " " + hra + " " + da + " " + pf + " " + np);
    }

}

class PayrollMain {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        System.out.println("Enter the number of employee:");
        int n = I.nextInt();
        Payroll[] details = new Payroll[n];

        for (int i = 0; i < n; i++) {
            details[i] = new Payroll(
                    I.nextInt(),
                    I.next(),
                    I.next(),
                    I.nextInt(),
                    I.nextInt(),
                    I.nextInt(),
                    I.nextInt());
        }
        System.out.println("Enter the employee number:\n" +
                "Enter the employee name:\n" +
                "Enter the designation:\n" +
                "Enter the basic pay:\n" +
                "Enter the Humen Resource Allowance:\n" +
                "Enter the Dearness Allowance :\n" +
                "Enter the Profitablity Fund:");

    }
}

class Iwin {
    String a;

    Iwin() {
        a = "Hello World";
    }

    Iwin get(String a) {
        this.a = a;
        return this;
    }

    void display() {
        System.out.println(a);
    }

}

class IwinMain {
    public static void main(String[] args) {
        Iwin obj = new Iwin();
        obj.get("Singam").display();
    }

}
