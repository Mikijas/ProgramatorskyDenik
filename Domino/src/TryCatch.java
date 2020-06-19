import java.util.Scanner;

public class TryCatch {

	public static int MetodaTryCatch() {
		int vyber = 0;
		Scanner sc = new Scanner(System.in);
		
		boolean err = false;
		do {
			try {
				vyber = sc.nextInt();
				err = false;
				
				
			}catch(Exception e) {
				err = true;
				sc = new Scanner(System.in);
						
			}
		}while(err ||( vyber < 1 || vyber >3));
		return vyber;
		
	}
	
	public static int Vyber(int AmountOfBlocks) {
		int vyber = 0;
		Scanner sc = new Scanner(System.in);
		
		boolean err = false;
		do {
			try {
				vyber = sc.nextInt();
				err = false;
				
				
			}catch(Exception e) {
				err = true;
				sc = new Scanner(System.in);
						
			}
		}while(err ||( vyber < 0 || vyber > AmountOfBlocks-1));
		return vyber;
		
	}
}
