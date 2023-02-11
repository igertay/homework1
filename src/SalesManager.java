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
    public int min() {
        int min = sales [0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int stat () {
        int mean = 0;
        for (int i = 0; i < sales.length; i++) {
        mean += sales[i];
    }
    mean = (mean - max() - min()) / (sales.length - 2);
        return mean;
}

}