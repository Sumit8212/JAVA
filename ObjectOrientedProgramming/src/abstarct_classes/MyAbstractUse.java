package abstarct_classes;

public class MyAbstractUse extends MyAbstract {
	
	// implementing abtract method print 
	// if not then we should make this class also abstract.
	public void print ()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAbstractUse m = new MyAbstractUse();
		m.print();

	}

}
