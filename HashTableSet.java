//Crhistopher Chiroy
//Boris Cifuentes
//Diego de León


//Algoritmos y estructura de datos
//Hoja de trabajo 9

import java.util.HashMap;
import java.util.Map.Entry;


public class HashTableSet implements WordSet{
	private HashMap<String,Word> base;
	
	public HashTableSet(){
		base = new HashMap<String, Word>();
	}
	
	@Override
	public Word get(Word word){
		// TODO Auto-generated method stub
		return (Word) base.get(word.getWord());
	}

	@Override
	public void add(Word wordObject) {
		// TODO Auto-generated method stub
		base.put(wordObject.getWord(),wordObject);
		
	}
	
}
