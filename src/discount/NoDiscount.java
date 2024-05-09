package discount;

public class NoDiscount implements DiscountType{
    @Override
    public double getBillAmount(double billAmount) {
        return billAmount;
    }
}
