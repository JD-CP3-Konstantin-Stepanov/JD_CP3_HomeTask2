import java.util.Arrays;
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

    public long trimmedAvg() {

        Arrays.sort(sales);
        long sm = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales.length <= 2) {
                sm += sales[i];
            } else {
                if (i != 0 && i != (sales.length - 1)) {
                    sm += sales[i];
                }
            }
        }

        if (sales.length <= 2) {
            sm = sm / sales.length;
        } else {
            sm = sm / (sales.length - 2);
        }

        return sm;
    }
}