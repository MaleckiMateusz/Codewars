
public class ProdFib {

	public static void main(String[] args) {
		System.out.println(productFib(4895));
		System.out.println(productFib(5895));
		System.out.println(productFib(1836311903));

	}
	/*
	public static long[] productFib(long prod) {
		long[] arr = new long[3];
	    for(int i=0; i<20; i++) {
	    	if(fib(i) * fib(i+1) == prod) {
	    		arr[0] = fib(i);
	    		arr[1] = fib(i+1);
	    		arr[2] = 1;
	    		break;
	    	}
	    	if(fib(i) * fib(i+1) < prod) {
	    		arr[0] = fib(i+1);
	    		arr[1] = fib(i+2);
	    		arr[2] = 0;
	    	}
	    }
	    System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		return null;
	}
	
	public static long[] productFib(long prod) {
		long[] arr = new long[3];
		arr[2] = 0;
	    for(int i=0; fib(i) * fib(i+1) < prod; i++) {
    		arr[0] = fib(i+1);
    		arr[1] = fib(i+2);
	    	if(fib(i+1) * fib(i+2) == prod)
	    		arr[2] = 1;
	    }
		return arr;
	}
	*/
	
	public static long[] productFib(long prod) {
		long[] arr = {0, 1, 0};
	    for(long n=0; arr[0]*arr[1] < prod;) {
	    	n=arr[0]+arr[1];
	    	arr[0]=arr[1];
	    	arr[1]=n;
	    	if(arr[0]*arr[1] == prod)
	    		arr[2] = 1;
	    }
	    System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		return arr;
	}
}
