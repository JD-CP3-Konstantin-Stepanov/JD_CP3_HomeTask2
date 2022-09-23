import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int trimmedAvg() {

        Arrays.sort(sales);
        int sm = 0;
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