public class BinaryTree{
	// is the root
	private Association root;
	// constructor root = null
	public BinaryTree(){
		root = null;
	}
	// check if tree is empty
	public boolean isEmpty(){
		return root == null;
	}
	// inserts to call the other insert
	public void insert(String key, String value){
		root = insert(root,key,value);
	}
	
	// Recursive insert:
	// 
	public Association insert(Association a, String key, String value){
		// if node is empty we assign Association		
		if (a==null){
			a = new Association(key, value);
		}
		
		else{
			// if is alphabetically less try again on left
			if (key.compareToIgnoreCase(a.getKey()) < 0){
				a.left=insert(a.left, key, value);
			}
			// else common u know the else of less is more and the else of left is right
			else{
				a.right=insert(a.right,key,value);
			}
		}
		return a;
	}
	// This method translate using the tree
	// The assosiation should always be root
	// It searhes the tree for the keyword and return the value 
	public String translate(Association a, String word){
		String aKey;
		String result="";
		boolean found = false;
		// Searches until it finds the word or an empty node
		// this is exactly the same as above
		while ((a!=null)&&!found){
			aKey = a.getKey();
			if (word.compareToIgnoreCase(a.getKey()) < 0){
				a = a.getLeft();
			}
			
			else if (word.compareToIgnoreCase(a.getKey()) > 0){
				a = a.getRight();
			}
			// if it founds the wort get the result from the node value
			else{
				found = true;
				result= a.getValue();
			}
		}
		// if not found add ** next to it
		if(!found){
			result ="*"+word+"*";
		}
		result = result + " ";
		return result;
	}
	// print the tree in inOrder fashion
	public void inOrder(){
		inOrder(root);
	}
	// recursive function for inorder
	public void inOrder(Association r){
		if (r != null){
			inOrder(r.getLeft());
			System.out.println(r.toString()+" ");
			inOrder(r.getRight());
		}
	}

	public Association getRoot(){
		return root; 
	}

}

			
