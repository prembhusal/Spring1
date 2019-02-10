package org.first;

import java.util.List;

public class Organization {
	HotItem hotItem;
	private List employees;
	private String HelloMsg;
	/*//constructor method
	Organization(HotItem hotDrink) {
		this.hotItem = hotDrink;
	}*/
	
	public void setHelloMsg(String helloMsg) {
		HelloMsg = helloMsg;
	}

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
	
	public void init() {
		System.out.println("init method called");
	}
	public void destroy() {
		System.out.println("Destroy method called");
	}
	public void printMsg() {
		System.out.println(HelloMsg);
	}
}
