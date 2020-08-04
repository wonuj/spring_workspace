package kr.co.jhta.form;

public class ProductForm {	// form 태그 안에 있는 입력값을 받기 위해 만든 것

	private String catId;
	private String name;
	private long price;
	private long discountPrice;
	
	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(long discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	
}
