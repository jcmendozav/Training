package algoAndDS;

public class BTSClosest {
	public static int findClosestValueInBst(BST tree, int target) {
		// Write your code here.
		return findRecursive(tree, target, tree.value);
	}

	public static int findClosestBetween(int a, int b, int target) {
		if (Math.abs(a - target) < Math.abs(b - target)) {
			return a;
		} else {
			return b;
		}
	}

	public static int findRecursive(BST tree, int target, int closest) {
		// int
		if (tree == null) {
			return closest;
		} else {
			closest = findClosestBetween(closest, tree.value, target);
		}

		if (target >= tree.value) {
			return findRecursive(tree.right, target, closest);
		} else

			return findRecursive(tree.left, target, closest);
	}

}
