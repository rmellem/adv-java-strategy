package discount;

public class LiquidationDiscount implements DiscountType{
    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }
}
