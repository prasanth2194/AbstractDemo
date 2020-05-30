
abstract class Abstract_01 {
	abstract void animal();
}
class forest extends Abstract_01{

	@Override
	void animal() {
		System.out.println("Abstarct run Successful");
		
	}
	public static void main(String args[]){
		Abstract_01 s = new forest();
		s.animal();
	
}}
