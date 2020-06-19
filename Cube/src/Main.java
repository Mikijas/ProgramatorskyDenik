import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int min = 0;
		int max = 0;
		String z;
		int pocet = 0;
		
		System.out.println("Write how many cubes do you wanna");
		Scanner sc = new Scanner(System.in);
		Random RNG = new Random();
		int x = sc.nextInt();
		int []p = new int[x];
		System.out.println("V jakem rozsahu chcete mit ty krychle");
		System.out.println("Write mim number");
		boolean err = true;
		do {
		try {
			err = false;
			min = sc.nextInt();
			
			
		}catch(Exception e) {
			err = true;
			System.out.println(" plz, Write a number");
			sc = new Scanner(System.in);
		}
		}while(err);
		System.out.println("Now, write a max number");
		do {
			try {
				err = false;
				max = sc.nextInt();
				
				
			}catch(Exception e) {
				err = true;
				System.out.println(" plz, Write a number");
				sc = new Scanner(System.in);
			}
			}while(err);
		int max1 = max;
		int min1 = min;
		if(max < min) {
			System.out.println("Well, i must switch min with max... because you are idiot and you wrote min like max and max like min...");
			max = min1;
			min = max1;
		}
		for(int i = 0; i < x; i++) {
		int r = RNG.nextInt(max - min) +min;
		p[i] = r;
		pocet++;
		if(pocet % 2 == 0) {
			z = "Even";
		}else z = "Odd";
		
		Cube k = new Cube(r);
		System.out.println(pocet + ". " + k + " " + z);
		
		}
	
	
	}	

}