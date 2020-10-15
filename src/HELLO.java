import java.util.Arrays;
import java.util.Scanner;
public class HELLO {

    public static void main(String... args) {
//        System.out.println("Hello World!");
////------------------------------------------------------------------
//        int a=1;
//        int b=1;
//        boolean c = a==b;
//        System.out.println(c);
////------------------------------------------------------------------
//        int[] goals = new int[4];
//        goals[0] = 3;
//        goals[1] = 2;
//        goals[2] = 7;
//        goals[3] = 11;
//        System.out.println(Arrays.toString(goals));
//
//        int t = goals[0] + goals[1] + goals[2] + goals[3];
//        System.out.println(t);
//
//        // & - это 'и'
//        int salary = 1000;
//        if (salary > 800) {
//                System.out.println("больше 800");
//        } else if (salary>100) {
//            System.out.println("больше 5000");
//        } else System.out.println("Мало!");
//
//        int res = 1;
//
//        for (int i = 0; i <= 10; i++) {
////            res = res +1;
//            res += i;
//        }
//        System.out.println(res);
////------------------------------------------------------------------
//        int per = 0;
//        int i = 0;
//
//        do {
//            per = per + 1;
//            i++;
//        }
//        while(i <= 10);
//        System.out.println(per);
////------------------------------------------------------------------
//        int[] array = {1,2,3,4,5};
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + ", ");
//        }
////------------------------------------------------------------------
//        int[][] array1 = new int[2][3];
//        array1[0][0] = 11;
//        array1[0][1] = 12;
//        array1[0][2] = 13;
//        array1[1][0] = 14;
//        array1[1][1] = 15;
//        array1[1][2] = 16;
//
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                System.out.print(array1[i][j] + " ");
//            }
//            System.out.println();
//        }
////------------------------------------------------------------------
//        int[][] array2 = {{1,2,3};{4,5,6}};

////------------------------------------------------------------------
//        int a = 1000;
//        char b = (char) a;
//        System.out.println(b);
//
//        char c = 1000;
//        int d = (int) c;
//        System.out.println(d);
////------------------------------------------------------------------
        System.out.print("Введите неотрицательное целое число для вычисления факториала: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n;i++) {
            factorial = factorial * i;
        }
        System.out.println("n! = " + factorial);
        long backfactorial = factorial;
        for (long j = 1; j != backfactorial; j++) {
            backfactorial = backfactorial / j;
        }
        System.out.println("n от !n = " + backfactorial);
    }
}