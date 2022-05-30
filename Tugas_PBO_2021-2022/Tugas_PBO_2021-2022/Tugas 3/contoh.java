import java.util.Scanner;

class Kotak{
	public int  panjang;
	public int lebar;
	public int tinggi;
	
	public int volume(){
		return panjang*lebar*tinggi;
		}
	public Kotak(){}
	
	public Kotak(int sisi){
		panjang = sisi;
		lebar = sisi;
		tinggi = sisi;
		}
		public Kotak(int a, int b, int c){
		panjang = a;
		lebar = b;
		tinggi = c;
		}
	   }
	   
	   class contoh {
	   public static void main (String [] args){
			Scanner objek = new Scanner (System.in);
		
		Kotak kotak;
	
	while(true) {
	 System.out.println("pilih jenis bidang ruang: \n1,Kubus\n2.Balok");
	 int bidang = objek.nextInt();
	 
	 if (bidang == 1){
	 System.out.println("masukan nilai sisi: ");
	 int sisi = objek.nextInt();
	 kotak = new Kotak (sisi);
	 
	 break;
	}else bidang = 2;{
		System.out.println("masukan nilai panjang: ");
	   int panjang = objek.nextInt();
	   
	    System.out.println("masukukan nilai lebar: ");
	   int lebar = objek.nextInt();
	   
	    System.out.println("masukan nilai tinggi: ");
	   int tinggi = objek.nextInt();
	   kotak = new Kotak(panjang, lebar, tinggi);
	   
	   break;
	}
}
	System.out.println(String.format("volume kotak: %s", kotak.volume()));
	}
}
	 
