package algoAndDS;

public class InvertBTS {
	
	public static void print(BST node, String tag, int level) {
		if(node==null)
			return;
		System.out.println(tag+": "+" ,child:"+node+",value: "+node.value);
		level++;
		print(node.left,"father:"+node+"-left-"+level,level);
		print(node.right,"father:"+node+"-right-"+level,level);
		
	}
	
	public static void invert(BST tree) {
		
		 invertHelper(tree);
		
	}
	
	private static void invertHelper(BST tree) {
		// TODO Auto-generated method stub
		if(tree==null) {
			return;
		}
		
		swap(tree);
		invertHelper(tree.left);
		invertHelper(tree.right);
	}

	public static void swap(BST node) {
		if(node!=null) {
			BST oldRigth = node.right;
//			BTS oldLeft = node.left;
			node.right=node.left;
			node.left=oldRigth;
		}
	}

}
