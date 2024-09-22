// Peter Ruckmann

package model;

public class List<E> {

	private class ListNode {
		public E content;
		public ListNode next;
	}

	ListNode first = null;
	ListNode last = null;

	public List(E... contents) {
		for (E content: contents) {
			this.add(content);
		}
	}

	
	public void add(E content) {
	  ListNode newNode = new ListNode();
	  newNode.content = content;
	  newNode.next = null;

	  if (this.first == null) {
	 	first = newNode;
	  } else {
	 	last.next = newNode;
	  }
	  last = newNode;
	}
	

	public int length() {
		int result = 0;
		
		for (ListNode node = first; node!=null; node = node.next) {
			result++;
		}

		return result;
	}

	

	public String toString() {
		String result = "";

		for (ListNode node = first; node!=null; node = node.next) {
			result += "- " + node.content + "\n";
		}

		return result;
	}

}