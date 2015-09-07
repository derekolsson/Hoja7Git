public class BinaryTree{
	private Association root;
	
	public BinaryTree(){
		root = null;
	}
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public void insert(String key, String value){
		root = insert(root,key,value);
	}
	
	
	public Association insert(Association a, String key, String value){
		if (a==null){
			a = new Association(key, value);
		}
		
		else{
			if (key.compareToIgnoreCase(a.getKey()) < 0){
				a.left=insert(a.left, key, value);
			}
			else{
				a.right=insert(a.right,key,value);
			}
		}
		return a;
	}
	
	public String translate(Association a, String word){
		String aKey;
		String result="";
		boolean found = false;
		
		while ((a!=null)&&!found){
			aKey = a.getKey();
			if (word.compareToIgnoreCase(aKey) < 0){
				a = a.getLeft();
			}
			
			if (word.compareToIgnoreCase(aKey) > 0){
				a = a.getRight();
			}
			
			else{
				found = true;
				result= a.getValue();
			}
		}
		if(!found){
			result ="*"+word+"*";
		}
		result = result + " ";
		return result;
	}
	
	public void inOrder(){
	}
}

			