package queue;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueLinkedlist ql=new QueueLinkedlist();
		System.out.println(ql.isEmpty());
		ql.enque(1);
		ql.enque(2);
		ql.enque(3);
		System.out.println(ql.isEmpty());
		System.out.println(ql.dequeue());
		System.out.println(ql.dequeue());
		System.out.println(ql.isEmpty());
		int x=-10;
		String str=String.valueOf(x);
		System.out.println(str);

	}

}
