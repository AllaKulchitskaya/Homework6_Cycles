public class Task1_3 {
    public static void main(String[] args) {
        int saving = 29000;
        int totalSaving = 0;
        for (int i = 1; i <= 12; i++) {
            totalSaving = totalSaving + saving;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalSaving + " рублей");
        }
    }
}
