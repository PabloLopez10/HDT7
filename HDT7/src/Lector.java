import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
	
	public void lector() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("diccionario.txt"));
		String line;
	    boolean primeraVez = true;
	    Nodo principal = new Nodo(null, null);
	    while ((line = reader.readLine()) != null)
	    {
	      int pos = line.indexOf(",");
	      int posf = line.indexOf(")");
	      if(primeraVez){
	    	  principal = new Nodo(line.substring(pos+2, posf), line.substring(1, pos));
	    	  primeraVez = false;
	      } else{
	    	  insert(principal, line.substring(1, pos), line.substring(pos+2, posf));
	      }
      
	    }
	    reader.close();
	}
	
	public void lector2() throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader("texto.txt"));
	    String linea;
	    linea = reader.readLine();
	    reader.close();
	    System.out.println("***************************************************");
	    System.out.println("La cadena que se desea traducir es: \n"+linea );
	    
	    String lineaDividida[] = linea.split(" ");
			
	    for(String palabra : lineaDividida){
		System.out.println(palabra);
	    }
	    
	    
	    
	}
	
	public void insert(Nodo node, String valorIng, String valorEsp) {
	    if (valorIng.compareTo(node.valorIng) < 0) {
	      if (node.left != null) {
	        insert(node.left, valorIng, valorEsp);
	      } else {
	        System.out.println("  Inserted " + valorIng + " to left of "
	            + node.valorIng);
	        node.left = new Nodo(valorEsp, valorIng);
	      }
	    } else if (valorIng.compareTo(node.valorIng) > 0) {
	      if (node.right != null) {
	        insert(node.right, valorIng, valorEsp);
	      } else {
	        System.out.println("  Inserted " + valorIng + " to right of "
	            + node.valorIng);
	        node.right = new Nodo(valorEsp, valorIng);
	      }
	    }
	}
	
	
}
