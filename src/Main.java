public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {

        // Задание 1

        int [] ledger = generateRandomArray();
        int sumPerMonth = 0;
        for (int a : ledger) {
            sumPerMonth = sumPerMonth + a;
        }
        System.out.println("Сумма трат за месяц составила " + sumPerMonth + " рублей.");

        // Задание 2

        int maxSpending = 99_999;
        int minSpending = 200_001;
        for (int a : ledger) {
            if (a > maxSpending) {
                maxSpending = a;
            }
            if (a < minSpending) {
                minSpending = a;
            }
        }
        System.out.println("«Максимальная сумма трат за день составила "+ maxSpending + " рублей.");
        System.out.println("«Минимальная сумма трат за день составила " + minSpending + " рублей.");

        // Задание 3

        float numberOfDays = 30f;
        float averageSum = sumPerMonth / numberOfDays;
        System.out.println("«Средняя сумма трат за месяц составила " + averageSum + " рублей.");

        // задание 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0 ; i--){
            System.out.print(reverseFullName[i]);
        }

    }
}