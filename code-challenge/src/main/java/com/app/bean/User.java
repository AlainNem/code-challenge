package com.app.bean;

import java.util.Arrays;
import java.util.List;

public abstract class User {

	private int id;
	private String name;
	private String role;
	private int years;
	private List<Item> items;

	public User() {

	}

	public User(int id, String name, String role, int years, List<Item> items) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.years = years;
		this.items = items;
	}

	public static List<User> getAllUsers() {
		return Arrays.asList(
				new Employee(1, "Alain", "employee", 2, Arrays.asList(new Item(1,"snack",ItemType.other,15f),
																	  new Item(1,"lemon",ItemType.grocery,30f))),
				new Affiliate(2, "Fadi", "affiliate", 3, Arrays.asList(new Item(1,"pizza",ItemType.other,10f),
						  											   new Item(1,"labne",ItemType.other,30f))),
				new Customer(3, "Georges", "customer", 1, Arrays.asList(new Item(1,"chicken",ItemType.other,200f),
						  											    new Item(1,"tomato",ItemType.grocery,250f))),
				new Employee(4, "Rene", "employee", 2, Arrays.asList(new Item(1,"chips",ItemType.other,8f),
						  											 new Item(1,"crepe",ItemType.other,17.9f))),
				new Affiliate(5, "Rita", "affiliate", 3, Arrays.asList(new Item(1,"cucumbers",ItemType.grocery,15.6f),
						  											   new Item(1,"cigars",ItemType.other,2f))),
				new Customer(6, "Toni", "customer", 3, Arrays.asList(new Item(1,"steak",ItemType.other,70f),
						   												new Item(1,"tomato",ItemType.grocery,35.5f)))
				);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public abstract float calculateBill();

}
