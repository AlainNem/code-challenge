package com.app.bean;

import java.util.List;

public class Customer extends User {


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name, String role, int years, List<Item> items) {
		super(id, name, role, years, items);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateBill() {
		// TODO Auto-generated method stub
		float total = 0;
		float discount_calculation = 0;
		
		for (Item item : this.getItems()) {
			total = total + item.getPrice();
			if(item.getType() == ItemType.other)
				discount_calculation = discount_calculation + item.getPrice();
		}
		if(this.getYears() > 2)
			total = total - (discount_calculation*5/100);
		
	    int rest = (int)total/100;
	    
	    total = total - (rest * 5);
				
		return total;
	}

}
