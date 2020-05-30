
public interface User {
public static void sumof(int a,int b){
	try{
		int sum =a/b;
		System.out.println(sum);
	}catch(ArithmeticException e){
		System.out.print("Denominator Cannot be Zero");
		System.out.println(e.getMessage());
		
	}
}
}
