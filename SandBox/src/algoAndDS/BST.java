package algoAndDS;

public class BST {
	public int value;
	public BST left;
	public BST right;

	public static class BSTBuilder {
		private BST left;
		private BST right;
		private int value;

		public BSTBuilder setValue(int value) {
			this.value = value;
			return this;
		}

		public BSTBuilder setLeft(BST left) {
			this.left = left;
			return this;
		}

		public BSTBuilder setRight(BST right) {
			this.right = right;
			return this;
		}

		public BST build() {
			return new BST(this);
		}
	}

	private BST(BSTBuilder builder) {
		this.value = builder.value;
		this.right = builder.right;
		this.left = builder.left;
	}
	
	public BST insert(int value) {

		return this;
	}
	
	public BST remove(int value) {
		return this;
	}
	
	public boolean contains (int value) {
		
		return false;
	}
	
}