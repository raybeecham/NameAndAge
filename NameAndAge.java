import java.util.Scanner;
public class NameAndAge {
    public static void main(String[] args)
    {
        String prompt = args[0];
        System.out.println(prompt);
        String name;
        int years = 5;
        int age;
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        age = in.nextInt();
        System.out.println("Hello, " + name + " nice to meet you\nYou will be " + (age+years) + " years old in 5 years!");
    }
}