import java.util.Scanner;

public class main {
public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Bulus Market ");
	String alisveris = "gecerli urunler..\n"
			+ "tomato\n"
			+ "banana\n"
			+ "cheese\n"
			+ "salt\n"
			+ "apple\n"
			+ "berry\n";
	System.out.println(alisveris);
	System.out.println("bir alisveris olusuturun");

	System.out.println("tomato sayisi:" );
		int tomato = scanner.nextInt();
	System.out.println("banana sayisi:" );
		int banana = scanner.nextInt();
	System.out.println("cheese sayisi:" );
		int cheese = scanner.nextInt();
	System.out.println("salt sayisi:" );
		int salt = scanner.nextInt();
	System.out.println("apple sayisi:" );
		int apple = scanner.nextInt();
	System.out.println("berry sayisi:" );
		int berry = scanner.nextInt();
		scanner.nextLine();

    market market = new market(tomato, banana, cheese, salt, apple, berry);
    System.out.println("Alisveris Basliyor..");
    while(market.alisverisBittimi() == false) {
		System.out.println("Alisveris Turu:{tomato-banana-cheese-salt-apple-berry");
		String tur = scanner.nextLine();
		System.out.println("Bu urunden kac tane alacaksiniz");
		int sayi = scanner.nextInt();
		scanner.nextLine();
		market.marketAliverisi(tur, sayi);
	}
	System.out.println("Alisveris Basarili Bir Sekilde Bitti..");
}
}
