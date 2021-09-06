import java.text.DecimalFormat;

public class Calc
{
	// ------De�i�kenlerimiz ------
	public double WorldWeight;
	public double MercuryWeight;
	public double VenusWeight;
	public double MarsWeight;
	public double JupiterWeight;
	public double SaturnWeight;
	public double NeptuneWeight;
	public double UranusWeight;
	public double MoonWeight;
	// ------De�i�kenlerimiz ------
	
	
	// ------Constructor(Yap�c�) Method ------
	public Calc(int weight) {
		//Ba�lang��ta ilk olarak atanan t�m gezegenlerin de�erlerinin hesaplanmas�
		this.WorldWeight=weight*1.0;
		this.MercuryWeight= weight*0.38;
		this.VenusWeight=weight*0.91;
		this.MarsWeight= weight*0.38;
		this.JupiterWeight=weight*2.34;
		this.SaturnWeight=weight*0.93;
		this.NeptuneWeight=weight*1.12;
		this.UranusWeight=weight*0.92;
		this.MoonWeight=weight*0.16;
	}
	// ------Constructor(Yap�c�) Method ------
	
	
	//Hesaplanan de�erleri ekrana bas�ld��� method
	public void printWeights()
	{
		System.out.print("D�nyada "+this.WorldWeight+"kg olan bir cismin a��rl���:"
				+ "\nMerk�rde a��rl���: "+this.MercuryWeight
				+ "\nVen�sde a��rl���: "+this.VenusWeight
				+ "\nMarsda a��rl���: "+this.MarsWeight
				+ "\nSat�rnde a��rl���: "+this.SaturnWeight
				+ "\nJupiterde a��rl���: "+this.JupiterWeight
				+ "\nNept�nde a��rl���: "+ new DecimalFormat("##.#").format(this.NeptuneWeight)//virg�lden sonraki 1 basa�� almas� i�in formatlanm��t�r
				+ "\nUran�sde a��rl���: "+new DecimalFormat("##.#").format(this.UranusWeight)//virg�lden sonraki 1 basa�� almas� i�in formatlanm��t�r
				+ "\nAyda a��rl���: "+this.MoonWeight);
	}
	//Hesaplanan de�erleri Ekrana Bas�ld��� Method
}
