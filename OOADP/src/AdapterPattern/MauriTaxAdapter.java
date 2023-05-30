package AdapterPattern;

class MauriTaxAdapter implements DecathlonTaxCal  {
	MauriTax mt=new MauriTax();
	
	public double CalTax(double amt) {
		return mt.getvat(amt);
	}

}
