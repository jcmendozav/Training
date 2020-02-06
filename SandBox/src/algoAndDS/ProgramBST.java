package algoAndDS;
class ProgramBST {
  static class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
      this.value = value;
    }

    public BST insert(int value) {
      // Write your code here.
      // Do not edit the return statement of this method.
    	BST current = this;
//    	if (current==null) {
//    		this.value=v;
//    	}
    	while(current!=null) {
    		if(current.value>value) {
    			current = current.right;
    		}
    		else {
    			current = current.left;
    		}
    	}
      return this;
    }
    
    public BST insertHelper(BST node, int value) {
    	
    	
    	return this;
    }

    public boolean contains(int value) {
      // Write your code here.
      return false;
    }

    public BST remove(int value) {
      // Write your code here.
      // Do not edit the return statement of this method.
      return this;
    }
  }
}
