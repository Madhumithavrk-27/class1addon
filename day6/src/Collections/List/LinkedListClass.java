package Collections.List;

import java.util.LinkedList;

public class LinkedListClass {
		public static void main(String[] args) {
			int[] arr = new int[5];
			LinkedList<Integer> llist = new LinkedList<>();
			llist.add(50);
			llist.add(10);
			llist.add(20);
			llist.add(30);
			llist.remove(2);
			
			System.out.println(llist.remove());
			System.out.println(llist);
		}
}
