public class Association{
	protected Association left,right;
	private String key;
	private String value;
	// Constructor 
	// left: is the left branch
	// right is the right branch
	// key: is the english word
	// value: is the spanish word
	public Association(){
		left=null;
		right=null;
		key=null;
		value=null;
	}
	
	public Association(String k, String v){
		left = null;
		right = null;
		key = k;
		value = v;
	}
	
	public void setLeft(Association n){
		left = n;
	}
	
	public void setRight(Association n){
		right = n;
	}
	
	public Association getLeft(){
		return left;
	}
	
	public Association getRight(){
		return right;
	}
	
	public void setKey(String s){
		key = s;
	}
	
	public void setValue(String s){
		value = s;
	}
	
	public String getKey(){
		return key;
	}
	
	public String getValue(){
		return value;
	}
	
	public String toString(){
		String s = "<"+key+", "+value+">";
		return s;
	}
	
}
	
