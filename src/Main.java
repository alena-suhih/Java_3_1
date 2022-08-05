public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int cost = 30;
        int miles = service.calculate(price, cost);
        System.out.println(miles);
    }
}
