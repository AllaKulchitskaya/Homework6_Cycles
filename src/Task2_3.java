public class Task2_3 {
    public static void main(String[] args) {
        int deposit = 29000;
        double total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}
