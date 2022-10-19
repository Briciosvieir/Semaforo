package semaforo;

import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Semaforo {
		
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		ThreandSemaforo semaforo = new ThreandSemaforo();
		
			while(true){
			
				System.out.println(semaforo.getCor());
				semaforo.esperarCorMudar();
				
					
		}
		
	}

}
