package classTask4;

public class MarketMember extends Shopper {

	public MarketMember() {;}
	
	@Override
	public void discount() {
		super.discount();
		this.setCoupon(1);
		this.setPoint(0.1);
		this.setDiscount(0.3);
	}
}
