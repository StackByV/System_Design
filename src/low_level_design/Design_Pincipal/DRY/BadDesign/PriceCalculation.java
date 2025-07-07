package low_level_design.Design_Pincipal.DRY.BadDesign;

class calculation{
    // same logic repeated in two methods
    public double calculateDiscount(double price) {
        return price - (price * 0.1);
    }

    public double finalPrice(double price) {
        return price - (price * 0.1); // same logic duplicated
    }
}

public class PriceCalculation {
}
