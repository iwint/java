import java.text.DecimalFormat;
import java.util.EventListener;
import java.util.Scanner;

class Anagram {


    public static int checkAnagram(String s1 , String s2){
        int isAnagram ;

        if(s1.length()==s2.length()){
            isAnagram = 0;
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i)==s2.charAt(j)){
                        isAnagram++;
                        break;
                    }
                }
            }
        }else{
            isAnagram = 0;
        }

        return  isAnagram;
    }

    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        String s1 = I.nextLine();
        String s2 = I.nextLine();
        int isAnagram = checkAnagram(s1,s2);
        if (isAnagram!=s1.length()){
            System.out.println("Not Anagram");

        }else{
            System.out.println("Anagram");
        }
    }
}



class Subsequence{
    public static boolean checkSubSequence(String s1,String s2){
        int i =0 ; int j =0;

        while (i<s1.length() && j<s2.length()){
                if (s1.charAt(i) == s2.charAt(j)){
                    j++;
                }
                i++;
            }
            return j==s2.length();

    }
    public static void main(String[] args) {
             Scanner  I= new Scanner(System.in);
             String s1=I.nextLine();
             String s2 = I.nextLine();
             if (checkSubSequence(s1,s2)){
                 System.out.println(1);
             }else{
                 System.out.println(0);
             }
    }
}


class Encryption{


    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        String num = I.nextLine();
        char[] arr =num.toCharArray();

        for (int i = 0; i < arr.length; i+=2) {
            if (i+1 < arr.length){
                char temp  = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        System.out.println(new String(arr));
    }
}


class countDigits{
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        String str  = I.nextLine();
        int sum = 0;
        String temp = "0";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                temp += Character.toString(str.charAt(i));  //temp = 1
            }
            if(Character.isLetter(str.charAt(i))){
                sum += Integer.parseInt(temp);  //sum = 1
                temp = "0";
            }
            //  temp 0
        }
        sum+=Integer.parseInt(temp);


        System.out.println(sum);
    }
}



class Puppy{

    int puppyAge;
    public Puppy(String name){
        System.out.println("Name :" +name);
    }

    public void setAge(int age){
        puppyAge = age;
    }
    public void getAge(){
        System.out.println("Puppy Age is " +puppyAge);
    }

}



class Progccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccram{
    public static void main(String[] args) {
        Puppy p = new Puppy("Tommy");
        p.setAge(5);
        p.getAge();
        Puppy p2=new Puppy("Iwin");
        System.out.println("Age is " +p.puppyAge);
    }
}

class housedetail {
    String housename;
    int doornum;
    String street;

    public void house() {
        System.out.println(housename);
        System.out.println("House Name");
    }
    public void details(){
        System.out.println(doornum);
        System.out.println("This is door num");
    }

}
class DINESH{
    public static void main(String[] args) {
        housedetail b=new housedetail();
        b.housename="Iwin illam";
        b.doornum=5;
        b.details();
        b.house();
    }
}

class Test{
    Test(){
        System.out.println("Hello World");
    }
}


class TestProgram{
    public static void main(String[] args) {
        Test I = new Test();
    }
}


class Students{
    String name;
    int marks;
    int RollNumber;


    String percentage;

    Students(){
        System.out.println("Enter name:");
        System.out.println("Enter roll number:");
        System.out.println("Enter total marks out of 500:");
        System.out.println("Student details:");
    }
    public void getDetails(){
        System.out.println("Name: " +name);
        System.out.println("Roll Number: " +RollNumber);
        System.out.println("Total: " +marks);
        System.out.println("Percentage: " +percentage);
    }
}


class StuudentProgram {
    public static void main(String[] args) {
        DecimalFormat d =new DecimalFormat("00.0");
        Scanner I = new Scanner(System.in);
        String name = I.nextLine();
        int rollNo = I.nextInt();
        int Total = I.nextInt();

        Students s =new Students();
        s.name = name;
        s.RollNumber = rollNo;
        s.marks = Total;
        s.percentage = d.format( Total*0.2);
        s.getDetails();


    }
}

class Factorial{
    public int calculateFactorial(int number){
        if (number == 1 || number ==0){
            return 1 ;
        }else{
            return (number * calculateFactorial(number-1));
        }
    }
}


class FactorialNumber{
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        int num = I.nextInt();
        Factorial fact = new Factorial();
        int result = fact.calculateFactorial(num);
        System.out.println(result);
    }

}


class ArithmaticOperation{
    public int Add(int n1,int n2){
        int n3 = n1+n2;
        return n3;
    }
    public int Subract(int n1,int n2){
        int n3 = n1-n2;
        return n3;
    }
    public int Multiply(int n1,int n2){
        return n1*n2;
    }
    public int Divide(int n1,int n2){
        int n3 = n1/n2;
        return n3;
    }
}


class ArithmaticProgram{
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        ArithmaticOperation d = new ArithmaticOperation();
        int a1 = I.nextInt();
        int a2 = I.nextInt();

        int s1=I.nextInt();
        int s2= I.nextInt();

        int m1 = I.nextInt();
        int m2 = I.nextInt();

        int d1 =I.nextInt();
        int d2 = I.nextInt();

        System.out.println(d.Add(a1,a2));
        System.out.println(d.Subract(s1,s2));
        System.out.println(d.Multiply(m1,m2));
        System.out.println(d.Divide(d1,d2));

    }
}


class ElectricityBill{

    int billNo;
    String name;
    int units ;
    long amount;

    ElectricityBill(int a ,String b , int c){
        this.billNo = a;
        this.name = b;
        this.units = c;
    }
    public void calculateBill(){
        if (units <=100){
            amount = Math.round( 1.20 * units);
        } else if (units <=300 ) {
          int temp = units -100;
          amount = Math.round(100*1.20);
          amount+=Math.round(temp*2);
        } else if (units>300) {
            int temp = units -300;
            amount =Math.round(300*2);
            amount+= Math.round(temp*3);
        }


        System.out.println(billNo);
        System.out.println(name);
        System.out.println(units);
        System.out.println(amount);
    }

}

class EBProgram{
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        int billNo = I.nextInt();
        String name = I.next();
        int units = I.nextInt();
        ElectricityBill eb = new ElectricityBill(billNo,name,units);
        eb.calculateBill();
    }
}


class BankDetails{
    int AccountNumber;
    String name;
    String type;
    int balance;
    int deposit;
    int withdrawal;

    void getDetails(){
        float Totalbalance =(balance+deposit)-withdrawal;
        System.out.println("Enter Details: \n" +
                "Account No. \n" +
                "Name: \n" +
                "Account Type: \n" +
                "Balance: \n" +
                "Enter Deposit Amount = \n" +
                "Enter Withdraw Amount = \n" +
                "Account No.: " +AccountNumber +"\n" +
                "Name: " +name + "\n" +
                "Account Type: " + type + "\n" +
                "Balance: " +Totalbalance
        );
    }
}


class BankDetailsProgram{
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        BankDetails b = new BankDetails();
        b.AccountNumber =I.nextInt();
        b.name = I.next();
        b.type=I.next();
        b.balance=I.nextInt();
        b.deposit=I.nextInt();
        b.withdrawal=I.nextInt();
        b.getDetails();
    }
}



class OddNumber{


    int addOnlyOdd(int num){
       int sum = 0;

       while (num-- > 0){
           if (num%2!=0){
               sum+=num;
           }else{
               continue;
           }
       }
        return sum;

    }
}

class oddNumberProgram{
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        int num =I.nextInt();
        OddNumber odd = new OddNumber();
        System.out.println(odd.addOnlyOdd(num));
    }
}


class SumOfDigit{
    int getSum(int num){
        int sum=0;

        while (num>0){
            int lastDigit = num%10;
            sum +=lastDigit;
            num =num/10;
        }

        return sum;
    }
}


class SumOfDigitProgram{
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        int num = I.nextInt();
        SumOfDigit sum= new SumOfDigit();
        System.out.println(sum.getSum(num));
    }
}



class OddOrEven{

    int num;
    void checkNumType(){
        if (num%2==0){
            System.out.println("EVEN");
        }else {
            System.out.println("ODD");
        }
    }
}

class OddOrEvenMain{
    public static void main(String[] args) {
        Scanner I =new Scanner(System.in);
        OddOrEven d = new OddOrEven();
        d.num = I.nextInt();
        d.checkNumType();
    }
}


abstract class  Iwin{
    abstract void get();
}

class Issac extends Iwin{
    @Override
    void get() {
        System.out.println("iwin");
    }
}

class ArrayOfObject{
    String name;
    int age;
    int marks;
    boolean isPassed;

    ArrayOfObject(String name , int age ,int marks ){
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.isPassed=(marks > 30) ? true : false;
    }

    void get(){
        System.out.println("{\n" +
                "name: " +name + "\n" +
                "age: " +age + "\n"+
                "marks: " +marks + "\n"+
                "isPassed: " +isPassed + "\n" +
                "}");
    }
}


class TotalMarks{

    int total = 0;

    int calTotal(int num){
        total += num;
        return total;
    }
}

 class MainProgram{
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        ArrayOfObject[] arr= new ArrayOfObject[3];
        TotalMarks calc = new TotalMarks();

        for (int i = 0; i < 3; i++) {
            arr[i] = new ArrayOfObject(
                    I.next(),
                    I.nextInt(),
                    I.nextInt()
            );
        }

        for (int i = 0; i < 3; i++) {
            arr[i].get();
            calc.calTotal(arr[i].marks);

        }

        System.out.println(calc.total);


    }
}





class AddNumbers{
    AddNumbers(){
        System.out.println("Enter the integer value of class A: \n" +
                           "Enter the integer value of class B:");
    }
    void Add(int a , int b){
        int c = a+b;
        System.out.println("The sum of two numbers: " + c);
    }
}


class AddNumbersProgram{
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        AddNumbers add =new AddNumbers();
        add.Add(I.nextInt(),I.nextInt());
    }
}



class NoOfStrings{
    int count (String str){
        int count = 0 ;
        int i =0;

        while (i<str.length()){
            if (Character.isDigit(str.charAt(i))){
                count++;
                i++;
            }else{
                i++;
            }
        }


        return count;
    }
}


class CountNumber {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        NoOfStrings c = new NoOfStrings();
        String str = I.nextLine();
        System.out.println(c.count(str));

    }
}

class Student{

   String name ;
   String marks ;
   String percentage;

   Student(String name, String marks , String percentage){
       this.name = name;
       this.marks = marks;
       this.percentage = percentage;


   }

   void getDetails(){
       if (name.contains("\n")){
           System.out.println(name+marks+""+percentage+"%" );
       }else{
           System.out.println(name);
           System.out.println(marks);
           System.out.println(percentage+"%");
       }
   }

}


class StudentMain{
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        Student st =new Student(I.nextLine(),I.nextLine(),I.nextLine());
        st.getDetails();
    }
}


class Animal{
    void sound(){
        System.out.println("Animal");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog");
    }
}

class AnimalMain{
    public static void main(String[] args) {
        Animal a;
        a = new Cat();
        a.sound();
        a = new Dog();
        a.sound();
    }
}