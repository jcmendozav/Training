package desing.pattern.builder;

public class OrderItem {
	public OrderItem(Builder builder) {
		// TODO Auto-generated constructor stub
		this.action=builder.action;
		this.desc=builder.desc;
		this.id=builder.id;
		this.productId=builder.productId;
	}

	public String getName() {
		return name;
	}

	public String getAction() {
		return action;
	}

	public String getDesc() {
		return desc;
	}

	public int getProductId() {
		return productId;
	}

	public int getId() {
		return id;
	}

	String name;
	String action;
	String desc;
	int productId;
	int id;
	
	public static class Builder{
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public Builder setAction(String action) {
			this.action = action;
			return this;
		}
		public Builder setDesc(String desc) {
			this.desc = desc;
			return this;
		}
		public Builder setProductId(int productId) {
			this.productId = productId;
			return this;
		}
		public Builder setId(int id) {
			this.id = id;
			return this;
		}
		
		public OrderItem build() {
			return new OrderItem(this);
		}
		
		
		
		String name;
		String action;
		String desc;
		int productId;
		int id;
		
	}

	@Override
	public String toString() {
		return "OrderItem [name=" + name + ", action=" + action + ", desc=" + desc + ", productId=" + productId
				+ ", id=" + id + "]";
	}
	
	

}
