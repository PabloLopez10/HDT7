import java.io.IOException;

public class main {
	public static void main(String args[]){
		Lector l = new Lector();
		
		try {
			
			
			l.lector();
			l.lector2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
