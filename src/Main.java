public class Main {
    public static void main(String[] args) {
        long[] sales = {2000L, 0L, 999L};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальная продажа: " + salesManager.max());
    }
}