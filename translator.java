import java.io.IOException;
public class translator{

	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.insert("house", "casa");
		tree.insert("dog", "perro");		
		tree.insert("homework", "tarea");
		tree.insert("woman", "mujer");
		tree.insert("town", "pueblo");
		tree.insert("yes", "si");
		tree.inOrder();
		String sentence = "";
		try {
			ReadFile rf = new ReadFile("test.txt");
			sentence = rf.OpenFile();
		    }
		catch (IOException e){
			sentence = "El Perro se comio mi tarea";
		}	
		String[] words = sentence.split("\\s+");

		for (int i=0; i<words.length; i++){
			words[i] = words[i].replaceAll("[^\\w]", "");
		}	
		String result = "";                
	        for (int i=0; i<words.length; i++){
			System.out.println(words[i]);
			result += tree.translate(tree.getRoot(), words[i]);
			
		
		}

		System.out.println(result);	
	}
}
