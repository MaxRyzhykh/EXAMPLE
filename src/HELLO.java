import java.util.Arrays;
import java.util.Scanner;
public class HELLO {

	static void printArgs(String... args){
		for(int i=0; i < args.length; i++){
			System.out.println(args[i]);
		}
	}

	static  int factorial(int number) {
		if(number == 1) {
			return 1;
		}
		return number * factorial(number - 1);
	}

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
//        System.out.print("Введите неотрицательное целое число для вычисления факториала: ");
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//
//        long factorial = 1;
//        for (int i = 1; i <= n;i++) {
//            factorial = factorial * i;
//        }
//        System.out.println("n! = " + factorial);
//        long backfactorial = factorial;
//        for (long j = 1; j != backfactorial; j++) {
//            backfactorial = backfactorial / j;
//        }
//        System.out.println("n от !n = " + backfactorial);
////===================================================================
		////класс java Person, создаём и создаём объекты этого класса ниже
//        Person person1 = new Person("Harry", "Potter", 17);
//        person1.firstName = "Harry";
//        person1.lastName = "Potter";
//        person1.age = 17;

//        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.age);
//        Person person3 = person1; // делаем сылку на объект(данные так капировать нельза даже если обект 3 новый)
//        person3.firstName = "Tom";

//        person1.printPersonFullInfo(); // метод создан в классе для вывода

//        Person person2 = new Person("Volan", "de mort");
//        person2.firstName = "Tom";
//        person2.lastName = "Reddle";
//        person2.age = 70;

//        System.out.println(person2.firstName + " " + person2.lastName + " " + person2.age);
//        person2.printPersonFullInfo();
//        System.out.println(person2.firstName + " " + person2.lastName + " " + person2.age);
//        String person1FullInfo = person1.getFullInfo( false);
//        System.out.println("Полная информация о человек: " + person1FullInfo);

//        Person person4 = new Person(person1);
// Сравнение
//        System.out.println(person1.theSamePerson(person2));
//        System.out.println(person1.theSamePerson(person3));

		//    int ch = 123;

		//   for (int i = 0; i < ch.l  )

//        System.out.println(102 % 1001);

		System.out.println(factorial(4));

//        System.out.println(printArgs());

//        Rectangle rectangle1 = new Rectangle(4, 3);
//        System.out.println(rectangle1.area());
//        System.out.println(rectangle1.perimeter());
		
	}
}