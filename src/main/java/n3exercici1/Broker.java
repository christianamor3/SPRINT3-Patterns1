package n3exercici1;

import java.util.ArrayList;

import n3exercici1.ConcreteClasses.Order;

public class Broker {

	ArrayList<Order> orderList = new ArrayList<>();
	
	void takeOrder(Order order) {
		orderList.add(order);
	}
	
	void placeOrders() {
		orderList.stream().forEach(o -> o.execute());
	}
	
	
}
