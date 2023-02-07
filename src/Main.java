public class Main {
    public static void main(String[] args) {
        int[] allSales = {1, 3, 5, 7, 9, 11, 20};
        SalesManager abracaadabra = new SalesManager(allSales);

        System.out.println("Самая большая продажа: " + abracaadabra.max());
    }
}