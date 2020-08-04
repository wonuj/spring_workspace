package kr.co.jhta.form;

public class OrderForm {
	// 주문 정보 관련
	private String username;
	private String usertel;
	private long productNo;
	private String productName;
	private long productPrice;
	private long productDiscountPrice;
	private int amount;
	private long price;
	
	// 결제 관련
	private String payType;
	private String payAccount;
	
	// 배송관련
	private String recieverUsername;
	private String recieverTel;
	private String recieverAddress;
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	public long getProductDiscountPrice() {
		return productDiscountPrice;
	}
	public void setProductDiscountPrice(long productDiscountPrice) {
		this.productDiscountPrice = productDiscountPrice;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsertel() {
		return usertel;
	}
	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}
	public long getProductNo() {
		return productNo;
	}
	public void setProductNo(long productNo) {
		this.productNo = productNo;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayAccount() {
		return payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}
	public String getRecieverUsername() {
		return recieverUsername;
	}
	public void setRecieverUsername(String recieverUsername) {
		this.recieverUsername = recieverUsername;
	}
	public String getRecieverTel() {
		return recieverTel;
	}
	public void setRecieverTel(String recieverTel) {
		this.recieverTel = recieverTel;
	}
	public String getRecieverAddress() {
		return recieverAddress;
	}
	public void setRecieverAddress(String recieverAddress) {
		this.recieverAddress = recieverAddress;
	}
	@Override
	public String toString() {
		return "OrderForm [username=" + username + ", usertel=" + usertel + ", productNo=" + productNo + ", amount="
				+ amount + ", price=" + price + ", payType=" + payType + ", payAccount=" + payAccount
				+ ", recieverUsername=" + recieverUsername + ", recieverTel=" + recieverTel + ", recieverAddress="
				+ recieverAddress + "]";
	}
}
