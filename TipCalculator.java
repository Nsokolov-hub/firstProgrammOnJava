import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод и проверка суммы счёта
        System.out.print("Введите сумму счёта: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введено некорректное значение.");
            System.out.println("Сумма счёта должна быть положительным числом.");
            scanner.close();
            return;
        }
        double billAmount = scanner.nextDouble();
        if (billAmount <= 0) {
            System.out.println("Ошибка: введено некорректное значение.");
            System.out.println("Сумма счёта должна быть положительным числом.");
            scanner.close();
            return;
        }
        
        // Ввод и проверка процента чаевых
        System.out.print("Введите процент чаевых: ");
        if (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введено некорректное значение.");
            System.out.println("Процент чаевых должен быть неотрицательным числом.");
            scanner.close();
            return;
        }
        double tipPercentage = scanner.nextDouble();
        if (tipPercentage < 0) {
            System.out.println("Ошибка: введено некорректное значение.");
            System.out.println("Процент чаевых должен быть неотрицательным числом.");
            scanner.close();
            return;
        }
        
        // Ввод и проверка количества участников
        System.out.print("Введите количество участников: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: введено некорректное значение.");
            System.out.println("Количество участников должно быть положительным целым числом.");
            scanner.close();
            return;
        }
        int numberOfPeople = scanner.nextInt();
        if (numberOfPeople <= 0) {
            System.out.println("Ошибка: введено некорректное значение.");
            System.out.println("Количество участников должно быть положительным целым числом.");
            scanner.close();
            return;
        }
        
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