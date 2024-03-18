package stack;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s=new Stack(3);
		System.out.println(s.top);
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peak());
		System.out.println(s.peak());
		s.delete();
		
	}

}
