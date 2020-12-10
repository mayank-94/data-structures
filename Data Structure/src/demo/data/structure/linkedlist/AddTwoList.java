package demo.data.structure.linkedlist;

class Link{
	int data;
	Link next;
	
	Link(int data){
		this.data = data;
	}
}

class SinglyLinkList{
	
	Link head1, head2, add;
	
	void printList(Link node) {
		while(node != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
	}
	
	Link reverse(Link head) {
		Link current = head, prev = null, next = head;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
	
	
	Link addList(Link first, Link second) {
		
		first = reverse(first);
		second = reverse(second);
		
		Link result = null, prev = null, node = null;
		int carry = 0, sum;
		while(first != null || second != null) {
			sum = carry + (first != null ? first.data : 0) +
					(second != null ? second.data : 0);
			
			carry = sum > 9 ? 1 : 0;
			sum = sum % 10;
			node = new Link(sum);
			
			if(result == null) {
				result = node;
			}else {
				prev.next = node;
			}
			
			prev = node;
			first = first.next;
			second = second.next;
		}
		
		if(carry > 0) {
			node = new Link(carry);
			prev.next = node;
		}
		
		return reverse(result);
	}
	
}


public class AddTwoList {
	public static void main(String[] args) {
		
		SinglyLinkList list = new SinglyLinkList();
		list.head1 = new Link(5);
		list.head1.next = new Link(3);
		list.head1.next.next = new Link(1);
		System.out.print("First List is : ");
		list.printList(list.head1);
		System.out.println();
		
		list.head2 = new Link(8);
		list.head2.next = new Link(2);
		list.head2.next.next = new Link(3);
		System.out.print("Second List is : ");
		list.printList(list.head2);
		System.out.println();
		
		list.add = list.addList(list.head1, list.head2);
		list.printList(list.add);
		
	}
}
