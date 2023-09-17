
package com.SellaProductonTheDiscount;

public class ProductImpl extends Product {
	
	public static void main(String[] args) {
		ProductImpl Impl = new ProductImpl();
	    Impl.getUserDetails("Sai", "Kiran", "Lenovo");
	    ProductImpl.productPrice = 12000;
	    Impl.getDiscount(2000);
		
	}

}
