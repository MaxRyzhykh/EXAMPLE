public class Person {
    String firstName;
    String lastName;
    int age;
//1й конструктор
    Person(String fn, String ln, int a) {
        firstName = fn;
        lastName = ln;
        age = a;
    }
//2й конструктор
    Person(String fn, String ln) {
        firstName = fn;
        lastName = ln;
        age = -1;
    }
//3й конструктор
    Person(Person person) {
        firstName = person.firstName;
        lastName = person.lastName;
        age = person.age;
    }
//создаём метод
    //1
    void printPersonFullInfo() {
        String FullInfo = getFullInfo( true);

        System.out.println(FullInfo);
    }

    //2
    String getFullInfo(boolean includeAge) {
        String FullInfo = firstName + " " + lastName + " " + age + " лет";

        if (includeAge) {
            FullInfo += ", " + age + " лет";
        }

        return FullInfo;
    }
// сравнение
    boolean theSamePerson(Person person) {
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                age == person.age;

    }
}
