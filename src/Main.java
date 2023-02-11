public class Main {
    public static void main(String[] args) {
        int[] allSales = {3, 3, 5, 7, 9, 19, 20};
        SalesManager abracaadabra = new SalesManager(allSales);

        System.out.println("Самая большая продажа: " + abracaadabra.max());
        System.out.println("Самая маленькая продажа: " + abracaadabra.min());
        System.out.println("Среднее количество продаж: " + abracaadabra.stat());
    }
}