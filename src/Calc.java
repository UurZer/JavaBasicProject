import java.text.DecimalFormat;

public class Calc
{
	public double WorldWeight;
	public double MercuryWeight;
	public double VenusWeight;
	public double MarsWeight;
	public double JupiterWeight;
	public double SaturnWeight;
	public double NeptuneWeight;
	public double UranusWeight;
	public double MoonWeight;
	
	
	public Calc(int weight) {
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

	public void printWeights()
	{
		System.out.print("Dünyada "+this.WorldWeight+"kg olan bir cismin aðýrlýðý:"
				+ "\nMerkürde aðýrlýðý: "+this.MercuryWeight
				+ "\nVenüsde aðýrlýðý: "+this.VenusWeight
				+ "\nMarsda aðýrlýðý: "+this.MarsWeight
				+ "\nSatürnde aðýrlýðý: "+this.SaturnWeight
				+ "\nJupiterde aðýrlýðý: "+this.JupiterWeight
				+ "\nNeptünde aðýrlýðý: "+ new DecimalFormat("##.#").format(this.NeptuneWeight)
				+ "\nUranüsde aðýrlýðý: "+new DecimalFormat("##.#").format(this.UranusWeight)
				+ "\nAyda aðýrlýðý: "+this.MoonWeight);
	}
}
