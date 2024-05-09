package discount;

public class NormalDiscount implements DiscountType{
    @Override
    public double getBillAmount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}
