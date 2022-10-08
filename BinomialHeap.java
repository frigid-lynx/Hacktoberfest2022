// Java Program to Implement Binomial Heap 

// Importing required classes 
import java.io.*; 

// Class 1 
// BinomialHeapNode 
class BinomialHeapNode { 

	int key, degree; 
	BinomialHeapNode parent; 
	BinomialHeapNode sibling; 
	BinomialHeapNode child; 

	// Constructor of this class 
	public BinomialHeapNode(int k) 
	{ 

		key = k; 
		degree = 0; 
		parent = null; 
		sibling = null; 
		child = null; 
	} 

	// Method 1 
	// To reverse 
	public BinomialHeapNode reverse(BinomialHeapNode sibl) 
	{ 
		BinomialHeapNode ret; 
		if (sibling != null) 
			ret = sibling.reverse(this); 
		else
			ret = this; 
		sibling = sibl; 
		return ret; 
	} 

	// Method 2 
	// To find minimum node 
	public BinomialHeapNode findMinNode() 
	{ 

		// this keyword refers to current instance itself 
		BinomialHeapNode x = this, y = this; 
		int min = x.key; 

		while (x != null) { 
			if (x.key < min) { 
				y = x; 
				min = x.key; 
			} 

			x = x.sibling; 
		} 

		return y; 
	} 

	// Method 3 
	// To find node with key value 
	public BinomialHeapNode findANodeWithKey(int value) 
	{ 

		BinomialHeapNode temp = this, node = null; 

		while (temp != null) { 
			if (temp.key == value) { 
				node = temp; 
				break; 
			} 

			if (temp.child == null) 
				temp = temp.sibling; 

			else { 
				node = temp.child.findANodeWithKey(value); 
				if (node == null) 
					temp = temp.sibling; 
				else
					break; 
			} 
		} 

		return node; 
	} 

	// Method 4 
	// To get the size 
	public int getSize() 
	{ 
		return ( 
			1 + ((child == null) ? 0 : child.getSize()) 
			+ ((sibling == null) ? 0 : sibling.getSize())); 
	} 
} 

// Class 2 
// BinomialHeap 
class BinomialHeap { 

	// Member variables of this class 
	private BinomialHeapNode Nodes; 
	private int size; 

	// Constructor of this class 
	public BinomialHeap() 
	{ 
		Nodes = null; 
		size = 0; 
	} 

	// Checking if heap is empty 
	public boolean isEmpty() { return Nodes == null; } 

	// Method 1 
	// To get the size 
	public int getSize() { return size; } 

	// Method 2 
	// Clear heap 
	public void makeEmpty() 
	{ 
		Nodes = null; 
		size = 0; 
	} 

	// Method 3 
	// To insert 
	public void insert(int value) 
	{ 

		if (value > 0) { 
			BinomialHeapNode temp 
				= new BinomialHeapNode(value); 
			if (Nodes == null) { 
				Nodes = temp; 
				size = 1; 
			} 
			else { 
				unionNodes(temp); 
				size++; 
			} 
		} 
	} 

	// Method 4 
	// To unite two binomial heaps 
	private void merge(BinomialHeapNode binHeap) 
	{ 
		BinomialHeapNode temp1 = Nodes, temp2 = binHeap; 

		while ((temp1 != null) && (temp2 != null)) { 

			if (temp1.degree == temp2.degree) { 

				BinomialHeapNode tmp = temp2; 
				temp2 = temp2.sibling; 
				tmp.sibling = temp1.sibling; 
				temp1.sibling = tmp; 
				temp1 = tmp.sibling; 
			} 

			else { 

				if (temp1.degree < temp2.degree) { 

					if ((temp1.sibling == null) 
						|| (temp1.sibling.degree 
							> temp2.degree)) { 
						BinomialHeapNode tmp = temp2; 
						temp2 = temp2.sibling; 
						tmp.sibling = temp1.sibling; 
						temp1.sibling = tmp; 
						temp1 = tmp.sibling; 
					} 

					else { 
						temp1 = temp1.sibling; 
					} 
				} 

				else { 
					BinomialHeapNode tmp = temp1; 
					temp1 = temp2; 
					temp2 = temp2.sibling; 
					temp1.sibling = tmp; 

					if (tmp == Nodes) { 
						Nodes = temp1; 
					} 

					else { 
					} 
				} 
			} 
		} 

		if (temp1 == null) { 
			temp1 = Nodes; 

			while (temp1.sibling != null) { 
				temp1 = temp1.sibling; 
			} 
			temp1.sibling = temp2; 
		} 

		else { 
		} 
	} 

	// Method 5 
	// For union of nodes 
	private void unionNodes(BinomialHeapNode binHeap) 
	{ 
		merge(binHeap); 

		BinomialHeapNode prevTemp = null, temp = Nodes, 
						nextTemp = Nodes.sibling; 

		while (nextTemp != null) { 

			if ((temp.degree != nextTemp.degree) 
				|| ((nextTemp.sibling != null) 
					&& (nextTemp.sibling.degree 
						== temp.degree))) { 
				prevTemp = temp; 
				temp = nextTemp; 
			} 

			else { 

				if (temp.key <= nextTemp.key) { 
					temp.sibling = nextTemp.sibling; 
					nextTemp.parent = temp; 
					nextTemp.sibling = temp.child; 
					temp.child = nextTemp; 
					temp.degree++; 
				} 

				else { 

					if (prevTemp == null) { 
						Nodes = nextTemp; 
					} 

					else { 
						prevTemp.sibling = nextTemp; 
					} 

					temp.parent = nextTemp; 
					temp.sibling = nextTemp.child; 
					nextTemp.child = temp; 
					nextTemp.degree++; 
					temp = nextTemp; 
				} 
			} 
			nextTemp = temp.sibling; 
		} 
	} 

	// Method 6 
	// To return minimum key 
	public int findMinimum() 
	{ 
		return Nodes.findMinNode().key; 
	} 

	// Method 7 
	// To delete a particular element */ 
	public void delete(int value) 
	{ 

		if ((Nodes != null) 
			&& (Nodes.findANodeWithKey(value) != null)) { 
			decreaseKeyValue(value, findMinimum() - 1); 
			extractMin(); 
		} 
	} 

	// Method 8 
	// To decrease key with a given value */ 
	public void decreaseKeyValue(int old_value, 
								int new_value) 
	{ 
		BinomialHeapNode temp 
			= Nodes.findANodeWithKey(old_value); 
		if (temp == null) 
			return; 
		temp.key = new_value; 
		BinomialHeapNode tempParent = temp.parent; 

		while ((tempParent != null) 
			&& (temp.key < tempParent.key)) { 
			int z = temp.key; 
			temp.key = tempParent.key; 
			tempParent.key = z; 

			temp = tempParent; 
			tempParent = tempParent.parent; 
		} 
	} 

	// Method 9 
	// To extract the node with the minimum key 
	public int extractMin() 
	{ 
		if (Nodes == null) 
			return -1; 

		BinomialHeapNode temp = Nodes, prevTemp = null; 
		BinomialHeapNode minNode = Nodes.findMinNode(); 

		while (temp.key != minNode.key) { 
			prevTemp = temp; 
			temp = temp.sibling; 
		} 

		if (prevTemp == null) { 
			Nodes = temp.sibling; 
		} 
		else { 
			prevTemp.sibling = temp.sibling; 
		} 

		temp = temp.child; 
		BinomialHeapNode fakeNode = temp; 

		while (temp != null) { 
			temp.parent = null; 
			temp = temp.sibling; 
		} 

		if ((Nodes == null) && (fakeNode == null)) { 
			size = 0; 
		} 
		else { 
			if ((Nodes == null) && (fakeNode != null)) { 
				Nodes = fakeNode.reverse(null); 
				size = Nodes.getSize(); 
			} 
			else { 
				if ((Nodes != null) && (fakeNode == null)) { 
					size = Nodes.getSize(); 
				} 
				else { 
					unionNodes(fakeNode.reverse(null)); 
					size = Nodes.getSize(); 
				} 
			} 
		} 

		return minNode.key; 
	} 

	// Method 10 
	// To display heap 
	public void displayHeap() 
	{ 
		System.out.print("\nHeap : "); 
		displayHeap(Nodes); 
		System.out.println("\n"); 
	} 

	private void displayHeap(BinomialHeapNode r) 
	{ 
		if (r != null) { 
			displayHeap(r.child); 
			System.out.print(r.key + " "); 
			displayHeap(r.sibling); 
		} 
	} 
} 

// Class 3 
// Main class 
public class GFG { 
	public static void main(String[] args) 
	{ 

		// Make object of BinomialHeap 
		BinomialHeap binHeap = new BinomialHeap(); 

		// Inserting in the binomial heap 
		// Custom input integer values 
		binHeap.insert(12); 
		binHeap.insert(8); 
		binHeap.insert(5); 
		binHeap.insert(15); 
		binHeap.insert(7); 
		binHeap.insert(2); 
		binHeap.insert(9); 

		// Size of binomial heap 
		System.out.println("Size of the binomial heap is "
						+ binHeap.getSize()); 

		// Displaying the binomial heap 
		binHeap.displayHeap(); 

		// Deletion in binomial heap 
		binHeap.delete(15); 
		binHeap.delete(8); 

		// Size of binomial heap 
		System.out.println("Size of the binomial heap is "
						+ binHeap.getSize()); 

		// Displaying the binomial heap 
		binHeap.displayHeap(); 

		// Making the heap empty 
		binHeap.makeEmpty(); 

		// checking if heap is empty 
		System.out.println(binHeap.isEmpty()); 
	} 
}
