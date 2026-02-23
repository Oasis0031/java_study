package classTask4;

public class Market {
	private String name;
	private int change;

	public Market() {
		;
	}

	public Market(String name) {
		this.name = name;
		this.change = change;
	}

	Shopper shopper = new Shopper();
	Product product = new Product();

	public void sale(Shopper shopper) {
		if (product.getStock() <= product.getSoldout()) {
			System.out.println("상품이 품절된 상태입니다.");
			return;
		}
		if (shopper instanceof MarketMember) {
			MarketMember marketMember = (MarketMember) shopper;
			this.change = marketMember.getMoney() - product.getPrice();
			product.setStock(product.getStock() -1);
		}
	}

	public void resister(Product product) {
		System.out.println("상품을 등록하세요.");
		
	}

	public void pointSystem() {

	}

}
