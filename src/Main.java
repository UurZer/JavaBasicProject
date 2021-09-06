
public class Main {
	
	public static void main(String[] args) {
		Calc calculater=new Calc(25);//Calc isimdeki sýnýfýmýzdan bir nesne türetiyoruz 
									 //ve parametre olarak da kilogram deðerimizi giriyoruz
									 //bu deðer Constructor'da iþlemden geçecek.  
		calculater.printWeights();//Nesnemizin bu methodu hesapladýðýmýz deðerleri ekrana basacaktýr.
	}
}

