import java.util.Scanner;
public class JavaLesson3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число:");
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            System.out.println(number);
        }
        else{
            System.out.println("Ошибка");
        }
        System.out.println(number * 10);
        System.out.println("окончание программы");
        scanner.close();
        return;
    }
}