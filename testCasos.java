//Crhistopher Chiroy
//Boris Cifuentes
//Diego de León


//Algoritmos y estructura de datos
//Hoja de trabajo 9


import static org.junit.Assert.*;

import org.junit.Test;


public class testCasos {
	SplayTreeSet C1 = new SplayTreeSet();
	RedBlackTreeSet C2 = new RedBlackTreeSet();
	HashTableSet C3 = new HashTableSet();
	TreeMapSet C4 = new TreeMapSet();
	
	@Test
	public void test_Add_Get_SplayTree() {
		Word word = new Word("palabra, tipo", null);
		//Prueba add
		C1.add(word);
		//Prueba get
		assertEquals(C1.get(word), word);
	}
	
	@Test
	public void test_Add_Get_RedBlackTree(){
		Word word = new Word("palabra, tipo", null);
		//Prueba add
		C2.add(word);
		//Prueba get
		assertEquals(C2.get(word), word);
	}
	
	@Test
	public void test_Add_Get_HashTable() {
		Word word = new Word("palabra, tipo", null);
		//Prueba add
		C3.add(word);
		//Prueba get
		assertEquals(C3.get(word), word);
	}
	
	@Test
	public void test_Add_Get_TreeMap() {
		Word word = new Word("palabra, tipo", null);
		//Prueba add
		C4.add(word);
		//Prueba get
		assertEquals(C4.get(word), word);
	}
}
