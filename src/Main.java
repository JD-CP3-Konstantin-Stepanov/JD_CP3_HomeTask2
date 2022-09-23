public class Main {
    public static void main(String[] args) {
        long[] sales = {3000L, 10L, 999L, 9999L, 5000L, 200L};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальная продажа: " + salesManager.max());
        System.out.println("Обрезанное среднее: " + salesManager.trimmedAvg());
    }
}