package Collections.List;

import java.util.ArrayList;

public class ArrayListClass {
      public static void main (String[] args) {
    	  int[] arr = new int[5];
    	  ArrayList<Integer> alist = new ArrayList<>(100);
    	  alist.add(10);
  		  alist.add(20);
  		  alist.add(30);
  		  alist.add(40);
  		  alist.remove(2);
      
  		System.out.println(alist.size());
		System.out.println(alist);
		System.out.println(alist.remove(1));
		System.out.println(alist);
		
      }
}
