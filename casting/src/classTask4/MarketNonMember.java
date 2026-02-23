package classTask4;

public class MarketNonMember extends Shopper {

	public MarketNonMember() {;}
	
	@Override
	public void discount() {
		super.discount();
		this.setCoupon(1);
		this.setPoint(0.05);
		this.setDiscount(0.05);
	}
	
}
