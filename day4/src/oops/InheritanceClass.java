package oops;

class Parent{
	String haricolor="Black";
	void behaviour() {
		System.out.println("Attitude");
	}
}

class Child extends Parent{
		String haricolor="Brown";
		public void behaviour() {
		System.out.println("Less Attitude");
	}
}

public class InheritanceClass {
		public static void main(String[]args) {
		Parent obj = new Child();
		obj.behaviour();
}
}
