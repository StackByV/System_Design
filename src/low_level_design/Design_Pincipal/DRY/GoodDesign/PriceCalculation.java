package low_level_design.Design_Pincipal.DRY.GoodDesign;

class calulation {
    public double applyDiscount(double price) {
        return price - (price * 0.1);
    }

    public double finalPrice(double price) {
        return applyDiscount(price); // Reuse logic
    }

}

public class PriceCalculation {
}
