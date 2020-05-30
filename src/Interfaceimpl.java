
public class Interfaceimpl implements InterfaceDemo , Interface02{

	@Override
	public void animal() {
		System.out.println("animal demo");
		
	}
	public static void main(String[] args){
		InterfaceDemo s = new Interfaceimpl();
		Interface02 d = new Interfaceimpl();
		s.animal();
		InterfaceDemo.print();
		d.dog();
		Interface02.demo();
		
	}
	@Override
	public void dog() {
		// TODO Auto-generated method stub
		System.out.println("dog");
		
	}
	@Override
	public void cat() {
		// TODO Auto-generated method stub
		
	}
	

}
