import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
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