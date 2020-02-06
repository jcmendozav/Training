package algoAndDS;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;



class TestValidateBTS {

	private TestBST test6;
	private TestBST test11;

	@Test
//	@Disabled("Disabling test")
	void test6() {

	    this.test6 = new TestBST(10);
	    this.test6.insert(5).insert(15).insert(5).insert(2).insert(1).insert(22);
	    test6.left.right.right = new TestBST(11);
	    test6.print();
	    assertEquals(false, ValidateBTS.validateBst(test6));
	}
	
	@Test
	void test11() {
		this.test11 = new TestBST(10);
	    this.test11.insert(5).insert(15);
	    test11.left.right = new TestBST(10);
	    test11.print();
	    assertEquals(false, ValidateBTS.validateBst(test11));

	}

	  class TestBST extends ValidateBTS.BST {
		    public TestBST(int value) {
		      super(value);
		    }
		    
		    public void print() {
		    	print(this,"head",1);
		    }
		    
			public void print(ValidateBTS.BST node, String tag, int level) {
				if(node==null)
					return;
				System.out.println(tag+": "+" ,child:"+node+",value: "+node.value);
				level++;
				print(node.left,"father:"+node+"-left-"+level,level);
				print(node.right,"father:"+node+"-right-"+level,level);
				
			}

		    public TestBST insert(int value) {
		      ValidateBTS.BST current = null;
		      if (value < this.value) {
		        if (this.left == null) {
		          ValidateBTS.BST newBST = new ValidateBTS.BST(value);
		          this.left = newBST;
		          return this;
		        } else {
		          current = this.left;
		        }
		      } else {
		        if (right == null) {
		          ValidateBTS.BST newBST = new ValidateBTS.BST(value);
		          this.right = newBST;
		          return this;
		        } else {
		          current = this.right;
		        }
		      }
		      while (true) {
		        if (value < current.value) {
		          if (current.left == null) {
		            ValidateBTS.BST newBST = new ValidateBTS.BST(value);
		            current.left = newBST;
		            return this;
		          } else {
		            current = current.left;
		          }
		        } else {
		          if (current.right == null) {
		            ValidateBTS.BST newBST = new ValidateBTS.BST(value);
		            current.right = newBST;
		            return this;
		          } else {
		            current = current.right;
		          }
		        }
		      }
		    }
		  }

}
