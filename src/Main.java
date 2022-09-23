public class Main {
    public static void main(String[] args) {
        int[] sales = {5000,0,999};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальная продажа: " + salesManager.max());
    }
}