package desing.pattern.builder;

import java.time.LocalDateTime;
import java.util.List;

public class Order {

	private List<OrderItem> orderItemList;

	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public int getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}

	public LocalDateTime getCreationDate() {
		return creationDate;
	}

	private int id;
	private String desc;
	private LocalDateTime creationDate;

	private Order(Builder builder) {
		this.creationDate = builder.creationDate;
		this.desc = builder.desc;
		this.id = builder.id;
		this.orderItemList = builder.orderItemList;

	}

	public static class Builder {

		public Builder(int id) {
			// TODO Auto-generated constructor stub
			this.id = id;
		}

		public Builder setOrderItemList(List<OrderItem> orderItemList) {
			this.orderItemList = orderItemList;
			return this;
		}

		public Builder setId(int id) {
			this.id = id;
			return this;

		}

		public Builder setDesc(String desc) {
			this.desc = desc;
			return this;

		}

		public Builder setCreationDate(LocalDateTime creationDate) {
			this.creationDate = creationDate;
			return this;

		}

		public Order build() {
			return new Order(this);
		}

		private List<OrderItem> orderItemList;
		private int id;
		private String desc;
		private LocalDateTime creationDate;

	}

	@Override
	public String toString() {
		return "Order [orderItemList=" + orderItemList + ", id=" + id + ", desc=" + desc + ", creationDate="
				+ creationDate + "]";
	}

}
