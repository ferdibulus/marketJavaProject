
public class market {
	private int tomatoSayisi;
	private int bananaSayisi;
	private int cheeseSayisi;
	private int saltSayisi; 
	private int appleSayisi;
	private int berrySayisi;
	
	public void marketAliverisi(String urun, int adet) {
		 
			if(urun.equals("Tomato")) {
				TomatoAl(adet);
			}
			else if(urun.equals("Banana")) {
				BananaAl(adet);
			}
			else if(urun.equals("Cheese")) {
				CheeseAl(adet);
			}
			else if(urun.equals("Salt")) {
				SaltAl(adet);
			}
			else if(urun.equals("Apple")) {
				AppleAl(adet);
			}
			else if(urun.equals("Berry")) {
				BerryAl(adet);
			}
			else {
				System.out.println("Gecersiz Urun");
			}
}
	
	public void TomatoAl(int adet) {
		if(tomatoSayisi == 0) {
			System.out.println("Urun kalmadi..");
		}
		if(tomatoSayisi - adet < 0) {
			System.out.println("Urun alindi Afiyet olsun");
			tomatoSayisi = 0;
			System.out.println("Kalan domates:" + tomatoSayisi);
		}
	}
	public void BananaAl(int adet) {
		if(bananaSayisi == 0) {
			System.out.println("Urun kalmadi..");
		}
		if(bananaSayisi - adet < 0) {
			System.out.println("Urun alindi Afiyet olsun");
			bananaSayisi = 0;
			System.out.println("Kalan banana:" + bananaSayisi);
		}
	}
	public void CheeseAl(int adet) {
		if(cheeseSayisi == 0) {
			System.out.println("Urun kalmadi..");
		}
		if(cheeseSayisi - adet < 0) {
			System.out.println("Urun alindi Afiyet olsun");
			cheeseSayisi = 0;
			System.out.println("Kalan cheese:" + cheeseSayisi);
		}
	}
	public void SaltAl(int adet) {
		if(saltSayisi == 0) {
			System.out.println("Urun kalmadi..");
		}
		if(saltSayisi - adet < 0) {
			System.out.println("Urun alindi Afiyet olsun");
			saltSayisi = 0;
			System.out.println("Kalan salt:" + saltSayisi);
		}
	}
	public void AppleAl(int adet) {
		if(appleSayisi == 0) {
			System.out.println("Urun kalmadi..");
		}
		if(appleSayisi - adet < 0) {
			System.out.println("Urun alindi Afiyet olsun");
			appleSayisi = 0;
			System.out.println("Kalan apple:" + appleSayisi);
		}
	}
	
	public void BerryAl(int adet) {
		if(berrySayisi == 0) {
			System.out.println("Urun kalmadi..");
		}
		if(berrySayisi - adet < 0) {
			System.out.println("Urun alindi Afiyet olsun");
			berrySayisi = 0;
			System.out.println("Kalan berry:" + berrySayisi);
		}
	}

	public market(int tomatoSayisi, int bananaSayisi, int cheeseSayisi, int saltSayisi, int appleSayisi,
			int berrySayisi) {
		super();
		this.setTomatoSayisi(tomatoSayisi);
		this.setBananaSayisi(bananaSayisi);
		this.setCheeseSayisi(cheeseSayisi);
		this.setSaltSayisi(saltSayisi);
		this.setAppleSayisi(appleSayisi);
		this.setBerrySayisi(berrySayisi);
	}

	public int getTomatoSayisi() {
		return tomatoSayisi;
	}

	public void setTomatoSayisi(int tomatoSayisi) {
		this.tomatoSayisi = tomatoSayisi;
	}

	public int getBananaSayisi() {
		return bananaSayisi;
	}

	public void setBananaSayisi(int bananaSayisi) {
		this.bananaSayisi = bananaSayisi;
	}

	public int getCheeseSayisi() {
		return cheeseSayisi;
	}

	public void setCheeseSayisi(int cheeseSayisi) {
		this.cheeseSayisi = cheeseSayisi;
	}

	public int getSaltSayisi() {
		return saltSayisi;
	}

	public void setSaltSayisi(int saltSayisi) {
		this.saltSayisi = saltSayisi;
	}

	public int getAppleSayisi() {
		return appleSayisi;
	}

	public void setAppleSayisi(int appleSayisi) {
		this.appleSayisi = appleSayisi;
	}

	public int getBerrySayisi() {
		return berrySayisi;
	}

	public void setBerrySayisi(int berrySayisi) {
		this.berrySayisi = berrySayisi;
	}
	public boolean alisverisBittimi() {
		return (tomatoSayisi == 0) && (appleSayisi == 0)&&(cheeseSayisi == 0)&&(berrySayisi == 0)&&(bananaSayisi == 0)&&(saltSayisi == 0);
	}
}