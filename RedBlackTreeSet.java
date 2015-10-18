//Crhistopher Chiroy
//Boris Cifuentes
//Diego de León


//Algoritmos y estructura de datos
//Hoja de trabajo 9

public class RedBlackTreeSet implements WordSet{
    RedBlackTree Tree= new RedBlackTree();
    
    	public void add(Word wordObject){
		Tree.add(wordObject);
	}
        
    	public Word get(Word word){
		return Tree.get(word);
	}
}
