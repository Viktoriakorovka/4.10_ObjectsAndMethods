public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40);
        basket.add("Bread", 10, 10, 5.5);
        basket.add("Bacon", 5);
        basket.print("Milk");
        System.out.println(basket.getTotalWeight());

    }
}
