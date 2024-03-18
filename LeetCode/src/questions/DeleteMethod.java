package questions;

import java.util.HashSet;

public class DeleteMethod {
	
	public void delet(LinkedListC ll) {
		
		HashSet<Integer>hs=new HashSet<>();
		Node next=ll.head;
		Node prev=null;
		
		while(next!=null) {
			if(hs.contains( next.value)) {
				prev.next=next.next;
				prev=prev;

			}else {
				hs.add(next.value);
				prev=next;

			}
			
			
						next=next.next;
			
		}
		
		
		
	}
	
	
	public void findNthLast(LinkedListC ll,int n) {
		
		Node p1=ll.head;
		Node p2=ll.head;
		int i=1;
		while(i<n) {
			p2=p2.next;
			i++;
		}
		
		while(p2.next!=null) {
			p1=p1.next;
			p2=p2.next;
		}
		
		System.out.println(p1.value);

	}


	public LinkedListC sumDigit(LinkedListC l1, LinkedListC l2) {
		// TODO Auto-generated method stub
	//	String str1=null,str2=null;
		 StringBuilder str1 = new StringBuilder();
		 StringBuilder str2 = new StringBuilder();
		Node n1=l1.head;
		Node n2=l2.head;
		
		
		while(n1!=null) {
			str1.append(n1.value);
			str2.append(n2.value);
			n1=n1.next;
			n2=n2.next;
		}
		str1.reverse();
		str2.reverse();
		String s1=str1.toString();
		String s2=str2.toString();
		int str=Integer.parseInt(s1)+Integer.parseInt(s1);
		System.out.println(str);
		
		LinkedListC lf=new LinkedListC();
		lf.create(str%10);
		str=str/10;
		
		while(str!=0) {
			lf.insert(str%10);
			str=str/10;
		}
		
		return lf;
	}
	
	

}
