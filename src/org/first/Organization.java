package org.first;

import java.util.List;

public class Organization {
	HotItem hotItem;
	private List employees;
	/*//constructor method
	Organization(HotItem hotDrink) {
		this.hotItem = hotDrink;
	}*/
	
	public void setEmployees(List employees) {
		this.employees = employees;
	}

	//setter method
	public  void setHotItem(HotItem hotDrink) {
		this.hotItem = hotDrink;
	}
	
	public void prepareHotDrink() {
		hotItem.prepareHotDrink();
	}
	public void displayEmployees() {
		System.out.println("Employees Name :"+employees);
	}
}
