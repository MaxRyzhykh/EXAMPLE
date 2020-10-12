import java.util.Arrays;

public class HELLO {

    public static void main(String... args) {
        System.out.println("Hello World!");

        int a=1;
        int b=1;
        boolean c = a==b;
        System.out.println(c);

        int[] goals = new int[4];
        goals[0] = 3;
        goals[1] = 2;
        goals[2] = 7;
        goals[3] = 11;
        System.out.println(Arrays.toString(goals));

        int t = goals[0] + goals[1] + goals[2] + goals[3];
        System.out.println(t);

        // & - это 'и'
        int salary = 1000;
        if (salary > 800) {
                System.out.println("больше 800");
        } else if (salary>100) {
            System.out.println("больше 5000");
        } else System.out.println("Мало!");

        int res = 1;

        for (int i = 0; i <= 10; i++) {
//            res = res +1;
            res += i;
        }
        System.out.println(res);

        int per = 0;
        int i = 0;

        do {
            per = per + 1;
            i++;
        }
        while(i <= 10);
        System.out.println(per);

    }
}
