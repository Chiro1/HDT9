//Crhistopher Chiroy
//Boris Cifuentes
//Diego de León


//Algoritmos y estructura de datos
//Hoja de trabajo 9

//Descripción: WordSetFactory. Clase  utilizada para instanciar los diferentes tipos de sets. 

class WordSetFactory {
	
	// Metodo que genera un objeto que implementa WordSet
	// parametro tipo: 1 = SimpleSet
	//                         2 = implementado con Red black tree
	//                         3 = implementado con Splay Tree
	//                         4 = implementado con Hash Table
	//                         5 = implementado con TreeMap (de Java Collection Framework)
	
	public static WordSet generateSet(int tipo)
	{
	    if (tipo == 1)
		    return new SimpleSet();
	    else if(tipo == 2)
	    	return new RedBlackTreeSet();
	    else if(tipo == 3)
	    	return new SplayTreeSet();
	    else if(tipo == 4)
	    	return new HashTableSet();
	    else if(tipo == 5)
	    	return new TreeMapSet();
		else
			return null;
	}	
}
