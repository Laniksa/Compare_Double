import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("""
                    Выберите действие:\s
                    1. Сравнить
                    2. Округлить
                    3. Отбросить дробную часть""");
            String line = scan.nextLine();
            int num = Integer.parseInt(line);
            switch (num) {
                case 1 -> {
                    System.out.println("Введите первое число: ");
                    String num1 = scan.nextLine();
                    System.out.println("Введите второе число: ");
                    String num2 = scan.nextLine();
                    if (Double.parseDouble(num1) - Double.parseDouble(num2) == 0) {
                        System.out.println("Результат: \n Числа равны");
                    } else {
                        System.out.println("Результат: \n Числа не равны");
                    }
                }
                case 2 -> {
                    System.out.println("Введите число: ");
                    String num3 = scan.nextLine();
                    long res = Math.round(Double.parseDouble(num3));// не поняла почему res не может быть int
                    System.out.println("Результат округления: " + res);
                }
                case 3 -> {
                    System.out.println("Введите число: ");
                    String num4 = scan.nextLine();
                    System.out.println("Результат: число без дробной части " + (long) Double.parseDouble(num4));//вопрос с long открытый
                }
                default -> System.out.println("Вы ввели неправильное число, попробуйте еще раз");
            }
        }



    }
}
