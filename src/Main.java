
public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 3000;
        int miles = service.calculate(price);
        System.out.println("You are earned: " + miles + " miles");

    }
}
