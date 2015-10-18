//Crhistopher Chiroy
//Boris Cifuentes
//Diego de León


//Algoritmos y estructura de datos
//Hoja de trabajo 9

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapSet implements WordSet{
	private TreeMap<String, Word> base;
	
	public TreeMapSet(){
		base = new TreeMap<String, Word>();
	}
	@Override
	public Word get(Word word) {
		
		return (Word) base.get(word.getWord());
	}
	
	@Override
	public void add(Word wordObject) {
		// TODO Auto-generated method stub
		base.put(wordObject.getWord(),wordObject);
	}
}
