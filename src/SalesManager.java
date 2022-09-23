public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1L;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}