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

class NIwin {
    String a;

    NIwin() {
        a = "Hello World";
    }

    NIwin get(String a) {
        this.a = a;
        return this;
    }

    void display() {
        System.out.println(a);
    }

}

class IwinMain {
    public static void main(String[] args) {
        NIwin obj = new NIwin();
        obj.get("Singam").display();
    }

}
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class NMain {
    public static void main(String[] args) {


        Scanner I = new Scanner(System.in);

//        int m = I.nextInt();
//        for (int i=2;i<=m;i++){
//            int prime = 0;//2
//            for (int j=2;j<=(i/2);j++){  //2 < 2/2
//                if(i%j ==0){
//                   prime = 1;
//                   break;
//                }
//            }
//            if (prime == 0){
//                System.out.print(i + " ");
//            }
//
//        }


//        int a = I.nextInt();
//        int b = I.nextInt();
//
//
//        for (int i = a; i<=b; ++i){
//            int firstDigit = i/10;
//            int lastDigit = i%10;
//            int sum = firstDigit+lastDigit;
//            int product = firstDigit*lastDigit;
//            int calc = sum+product;
//            if(i==calc){
//                System.out.println(i);
//            }
//        }




//        int num = I.nextInt();
//        int a = 0;
//        int b=1;
//        for (int i = 3;i<=num;i++){
//            int c=a+b;
//            a=b;
//            b=c;
//            if (i==num){
//                System.out.println(c);
//            }
//        }


//      int num = I.nextInt();
//
//      for (int i = 1;i<=num;i++){
//          if(i%2==0){
//              int Number = (i*i)-2;
//              System.out.print(Number + " ");
//          }else {
//              int Number = (i*i)-1;
//              System.out.print(Number + " ");
//          }
//      }


//        int[] array = new int[4];
//
//        for (int i =0 ; i<array.length;i++){
//            array[i]=I.nextInt();
//        }
//
//        for (int i = 0;i<array.length;i++){
//            System.out.print(array[i] + " ");
//        }


//        int num = I.nextInt();
//
//        if(Integer.toString(num).length()==3){
//              int MidNum = (num%100) /10;
//              if(MidNum %3==0){
//                  System.out.println("Trendy Number");
//              }else{
//                  System.out.println("Not a Trendy Number");
//              }
//        }else{
//            System.out.println("Invalid Number");
//        }


        int[] hours = new int[7];

        for (int i =0; i<7;i++){
            hours[i] = I.nextInt();
        }

        int total = 0;

        for (int i = 0; i<7;i++){
            if(hours[i]>8){
                total += hours[i]*(100+(15 * (hours[i]-8)));
            } else if (hours[i]<=8) {
                total += hours[i]*100;
            } else if ((i==0)) {
                if(hours[0]>8){
                    total += hours[0]*(50/100)*(100+(15*(hours[0]-8)));
                }else {
                    total += hours[0]*(50/100)*(100);
                }
            } else if ((i==6)) {
                if (hours[6]>8){
                    total += hours[6]*(25/100)*(100+(15 *(hours[6]-8)));
                }else {
                    total += hours[6]*(50/100)*(100);
                }
            }
        }

        System.out.println(total);





                



    }
}
