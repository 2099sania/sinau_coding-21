public class Persegi implements MainInterface {
	private int sisi;

	public static void main(String[] args){
		Persegi main = new persegi();
		main.sisi = 6;

		main.keliling();
		main.luas();
	}

	@Override
	public void keliling(){
		int keliling = 4 * sisi;
		System.out.println("Keliling Persegi dengan sisi " + sisi + " adalah " + keliling);		
	}

	@Override
	public void luas(){
		int luas = sisi * sisi;
		System.out.println("Luas Persegi dengan sisi " + sisi + " adalah " + luas);		
	}


}