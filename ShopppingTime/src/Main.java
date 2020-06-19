import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ShoppingList Invetory = new ShoppingList();
		try {
			
		ShoppingCar.Commodity();
	
		Scanner sc = new Scanner(System.in);
		double sumarum=0;
		
		//dodavani zbozi do obchodu
		LinkedShop<GoodInShop> shop = new LinkedShop<GoodInShop>();
		GoodInShop good1 = new GoodInShop("Potato", 0.5, 80);
		shop.add(good1);
		GoodInShop good2 = new GoodInShop("Tomato", 0.4, 5);
		shop.add(good2);
		GoodInShop good3 = new GoodInShop("Carrot", 0.6, 4);
		shop.add(good3);
		GoodInShop good4 = new GoodInShop("Cabbage", 1.2, 5);
		shop.add(good4);
		GoodInShop good5 = new GoodInShop("Celery", 2, 6);
		shop.add(good5);
		GoodInShop good6 = new GoodInShop("Beet", 6.9, 8);
		shop.add(good6);
		GoodInShop good7 = new GoodInShop("Onion", 0.01, 50);
		shop.add(good7);
		GoodInShop good8 = new GoodInShop("Garlic", 0.5, 69);
		shop.add(good8);
		GoodInShop good9 = new GoodInShop("Pumpkin", 3.6, 5);
		shop.add(good9);
		
		boolean end = true;
		do {
			int Choose = sc.nextInt();
			if(Choose < 0 || Choose > 9) {
				throw new ErrorException("0-9");
			}
		switch(Choose) {
		case 1:
			if(good1.getAmount() <= 0) {
				System.out.println("Sold out");
				break;
			}else {
			good1.setAmount(good1.getAmount()-1);
			Goods Potato = new Goods("Potato", 0.5);
			Invetory.add(Potato);
			System.out.println("you add 1 Potato");
			sumarum +=0.5;
			}
			break;
			
		case 2:
			if(good2.getAmount() <= 0) {
				System.out.println("Sold out");
				break;
			}else {
				good2.setAmount(good2.getAmount()-1);
			Goods Tomato = new Goods("Tomato", 0.4);
			Invetory.add(Tomato);
			System.out.println("you add 1 Tomato");
			sumarum +=0.4;
			}
			break;
			
		case 3:
			if(good3.getAmount() <= 0) {
				System.out.println("Sold out");
				break;
			}else {
				good3.setAmount(good3.getAmount()-1);
			Goods Carrot = new Goods("Carrot", 0.6);
			Invetory.add(Carrot);
			System.out.println("you add 1 Carrot");
			sumarum +=0.6;
			}
			break;
		case 4:
			good4.setAmount(good4.getAmount()-1);
			if(good4.getAmount() <= 0) {
				System.out.println("Sold out");
				break;
			}else {
				good4.setAmount(good4.getAmount()-1);
			Goods Cabbage = new Goods("Cabbage", 1.2);
			Invetory.add(Cabbage);
			System.out.println("you add 1 Cabbage");
			sumarum +=1.2;
			}
			break;
		case 5:
			
			if(good5.getAmount() <= 0) {
				System.out.println("Sold out");
				break;
			}else {
				good5.setAmount(good5.getAmount()-1);
			Goods Celery = new Goods("Celery", 2);
			Invetory.add(Celery);
			System.out.println("you add 1 Celery");
			sumarum +=2;
			}
			break;
		case 6:
			if(good6.getAmount() <= 0) {
				System.out.println("Sold out");
				break;
			}else {
				good6.setAmount(good6.getAmount()-1);
			Goods Beet = new Goods("Beet", 6.9);
			Invetory.add(Beet);
			System.out.println("you add 1 Beet");
			sumarum +=6.9;
			}
			break;
		case 7:
			if(good7.getAmount() <= 0) {
				System.out.println("Sold out");
				break;
			}else {
				good7.setAmount(good7.getAmount()-1);
			Goods Oninon = new Goods("Onion", 0.01);
			Invetory.add(Oninon);
			System.out.println("you add 1 Onion");
			sumarum +=0.01;
			}
			break;
		case 8:
			if(good8.getAmount() <= 0) {
				System.out.println("Sold out");
				break;
			}else {
				good8.setAmount(good8.getAmount()-1);
			Goods Garlic = new Goods("Garlic", 0.5);
			Invetory.add(Garlic);
			System.out.println("you add 1 Garlic");
			sumarum +=0.5;
			}
			break;
		case 9:
			if(good9.getAmount() <= 0) {
				System.out.println("Sold out");
				break;
			}else {
				good9.setAmount(good9.getAmount()-1);
			Goods Pumpkin = new Goods("Pumpkin", 3.6);
			Invetory.add(Pumpkin);
			System.out.println("you add 1 Pumpkin");
			sumarum +=3.6;
			}
			break;
		case 0:
			end = false;
			break;
		}
		}while(end);
		Invetory.syssout();
		System.out.println("prize......" + sumarum + "€");
		
		
		
		
		
		
		
		
		
		
		}catch(ErrorException e) {
			
		System.err.println(e.getMessage());
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
