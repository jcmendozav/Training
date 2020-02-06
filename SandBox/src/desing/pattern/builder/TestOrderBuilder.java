package desing.pattern.builder;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestOrderBuilder {

	@Test
	void test() {
		//fail("Not yet implemented");
		int orderId = 1;
		Order order = new Order.Builder(orderId).
				setCreationDate(LocalDateTime.now()).
				setDesc("First Order").build();
		
		System.out.println(order);
		assertEquals(orderId, order.getId());
				
				
	}

	@Test
	void test2() {
		List<OrderItem> orderItemList = new ArrayList<OrderItem>();
		orderItemList.add(new OrderItem.Builder().setId(1).setDesc("Add product").setAction("ADD").setProductId(1234).build());
		orderItemList.add(new OrderItem.Builder().setId(2).setAction("DELETE").setProductId(1235).build());
		LocalDateTime now = LocalDateTime.now();
		int orderId = 2;
		
		Order order = new Order.Builder(orderId).setOrderItemList(orderItemList).setCreationDate(now).build();
		
		System.out.println(order);

		assertEquals(orderId,order.getId());
		assertEquals(now, order.getCreationDate());
		assertEquals(orderItemList.size(), order.getOrderItemList().size());
		
		
		
		
	}
}
