
public class Persist {

	public static void main(String[] args) {
		System.out.println(persistence(39)); //3
		System.out.println(persistence(4)); //0
		System.out.println(persistence(25));  //2
		System.out.println(persistence(999));  //4

	}

	public static int persistence(long n) {
		int licznik = 0;
		for(;n>=10;licznik++) 
			n = multiple(n);			
		return licznik;
	}

	public static int multiple(long liczba) {
		int num = 1;
		for(;liczba>0; liczba /= 10)
			num *= liczba%10;
		return num;
	}
}
