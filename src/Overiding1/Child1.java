package Overiding1;

public class Child1 extends Parent1{
	
	@Override
	public void bhooba() {
		//TODO Auto-generated method stub
		System.out.println("Child's show()");
	}
	

	public static void main(String[] args) {
		Parent1 bh = new Parent1();
bh.bhooba();
Child1 h = new Child1();
h.bhooba();
	}

}
