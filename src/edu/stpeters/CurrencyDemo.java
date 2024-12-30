package edu.stpeters;

interface Money{
	void dollarToInr(int usDollar);
	
	void poundToInr(int ukPound);
	
}
class IndianRupee implements Money{

	@Override
	public void dollarToInr(int usDollar) {
		// TODO Auto-generated method stub
		float res = 84.75f * usDollar;
		System.out.println("dollar"+usDollar +"indian rupee,,-->"+res);
		}

	@Override
	public void poundToInr(int ukPound) {
		// TODO Auto-generated method stub
		float res = 120.65f * ukPound;
		System.out.println("UK POunds "+ukPound+"indian rupee,,-->"+res);
	}
	
}


public class CurrencyDemo {
	
	public static void main(String[] args){
		
IndianRupee indianRuppes = new IndianRupee();
		
		indianRuppes.dollarToInr(1500);
		indianRuppes.poundToInr(100);
		
		
	}

}
