import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Domino {
	public static void domino() {
		ArrayList<Domin> Array = new ArrayList<Domin>();
		ArrayList<Domin> ArrayHelp = new ArrayList<Domin>();
		System.out.println("How many blocks of domino do you want?");
		System.out.println("1 =     5   blocks");
		System.out.println("2 =     10  blocks");
		System.out.println("3 =     15  blocks");
		int AmountOfDomino = 0;
		
		Scanner sc = new Scanner(System.in);
		int choose =  TryCatch.MetodaTryCatch();
		switch(choose) {
		case 1: 
			AmountOfDomino = 5;
			break;
		case 2:
			AmountOfDomino = 10;
			break;
		case 3:
			AmountOfDomino = 15;
			break;
		}
	
		Random rng = new Random();
		for(int i = 0; i<AmountOfDomino	;i++) {
			int R = rng.nextInt(7);
			int L = rng.nextInt(7);
			Domin block = new Domin(R, L);
			Array.add(block);
		}
	int lastBlock = 0;
		do{
	
		System.out.println(Array);


	System.out.println("");
		System.out.println("Pick one of the blocks of domino");
		int chose = TryCatch.Vyber(AmountOfDomino);

	
		if(ArrayHelp.size() == 0) {
	
			ArrayHelp.add(Array.get(chose));
			Array.remove(chose);
		AmountOfDomino--;
	
		}else {
			if(ArrayHelp.get(lastBlock).getRightDomin() == Array.get(chose).getLeftDomin()) {
				
				ArrayHelp.add(Array.get(chose));
				Array.remove(chose);
				AmountOfDomino--;
				lastBlock ++;
			}else {
				if(ArrayHelp.get(lastBlock).getRightDomin() == Array.get(chose).getRightDomin()) {
				//int	help = Array.get(chose).getRightDomin();
				int right = Array.get(chose).getRightDomin();
				int left = Array.get(chose).getLeftDomin();
				Array.get(chose).setRightDomin(left);
				Array.get(chose).setLeftDomin(right);
				ArrayHelp.add(Array.get(chose));
				System.out.println(Array.get(chose));
				Array.remove(chose);
			
				AmountOfDomino--;
				lastBlock ++;
System.out.println("you switched sides");
				}else {
					System.out.println("!!!!!!!!!!!!!!!! You can't use this block of domino !!!!!!!!!!!!!!!!!");
					
				}
			}
				
		}
		System.out.println("playground");
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println(ArrayHelp);
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("");
		
		//kontrola
		boolean end = true;
		for(int i = 0; i < Array.size(); i++ ) {
			if(ArrayHelp.get(lastBlock).getRightDomin() == (Array.get(i).getLeftDomin())){
				end = false;
			}
				if(ArrayHelp.get(lastBlock).getRightDomin() == (Array.get(i).getRightDomin())){
				end = false;
				}
			}
		if((AmountOfDomino !=0)) {
			System.out.println("W-I-N-N-E-R!!!");
			System.exit(0);
		}
		if(end == true) {
			System.out.println(Array);
			System.out.println();
			System.out.println("G-A-M-E  O-V-E-R!!!");
			System.exit(0);
		}
		
		}while(AmountOfDomino !=0);
		System.out.println("W-I-N-N-E-R!!!");
	}

}
