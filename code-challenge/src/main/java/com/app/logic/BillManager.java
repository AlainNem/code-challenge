package com.app.logic;

import com.app.bean.User;
import com.app.repository.BillData;

public class BillManager {
	
	//This class can be instantiated in spring context
	BillData billData = new BillData();
	
	public float getBill(int id)
	{
		User user = billData.getUserById(id);
		
		return user.calculateBill();
	}

}
