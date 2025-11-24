package att27;

public class USAShippingService {
    public void shipItem(double weightInLbs, String address) {
        System.out.println("Shipping item to: " + address);
        System.out.println("Total weight: " + weightInLbs + " lbs");
    }
}