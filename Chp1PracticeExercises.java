class Person{
    int age;

    public void increaseAge(int i)
    {
        age = age + i;
    }
    public void decreaseAge(int i)
    {
        age = age - i;
    }

    Person(){
        age = 1;
    }
    Person(int a)
    {
        age = a;
    }

}
public class Chp1PracticeExercises{
    public static void main(String[] args) {
        Person sam = new Person();
        Person mina = new Person(18);
        // System.out.println("Sam's age: "+ sam.age);
        // sam.increaseAge(10);
        // System.out.println("Sam's age: "+ sam.age);
        // sam.age++;
        // System.out.println("Sam's age: "+ sam.age);

        // String verbPhrase = "is money";
        // System.out.println("Time" + verbPhrase);

        // String test = "abcdefg";
        // System.out.println(test);
        // System.out.println(test.length());
        // System.out.println("abcdefge".length());
        // System.out.println(test.charAt(1));

        // System.out.println(test.substring(3));
        // System.out.println(test.substring(3,5));

        // System.out.println("abc\ndef");
        // System.out.println("abc\\ndef");


        // String test2 = "Hello Tony";
        // // test2 = test2.toUpperCase();
        // System.out.println(test2.toUpperCase());
        // System.out.println(test2.toLowerCase());   
        // System.out.println(test2);

        // System.out.println("2 + 2 = " + (2 + 2));
        // System.out.println("2 + 2 = " + 2 + 2);

    }
}