import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных с запросами пользователю
        System.out.print("Введите сумму счёта: ");
        double billAmount = scanner.nextDouble();

        System.out.print("Введите процент чаевых: ");
        double tipPercentage = scanner.nextDouble();

        System.out.print("Введите количество участников: ");
        int numberOfPeople = scanner.nextInt();

        // Расчёты
        double tipAmount = billAmount * tipPercentage / 100;
        double totalAmount = billAmount + tipAmount;
        double perPersonAmount = totalAmount / numberOfPeople;

        // Вывод результатов в правильном порядке
        System.out.println(); // Пустая строка для разделения
        System.out.printf("Сумма счёта: %.2f%n", billAmount);
        System.out.printf("Сколько человек участвовало в обеде: %d%n", numberOfPeople);
        System.out.printf("Общий счёт: %.2f%n", totalAmount);
        System.out.printf("Процент чаевых: %.1f%%%n", tipPercentage);
        System.out.printf("С каждого: %.2f%n", perPersonAmount);

        scanner.close();
    }
}