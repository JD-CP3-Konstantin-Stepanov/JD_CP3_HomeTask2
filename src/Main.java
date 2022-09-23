public class Main {
    public static void main(String[] args) {
        int[] sales = {3000, 10, 999, 9999, 5000, 200};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальная продажа: " + salesManager.max());
        System.out.println("Обрезанное среднее: " + salesManager.trimmedAvg());
    }
}