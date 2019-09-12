package Lesson5HWproble6;

public class MainShallow {
	public static void main(String[] args) throws CloneNotSupportedException { 
		Computer com1 = new Computer("acer", "Intel Core I5", 8, 512, 2.30); 
		Person p1 = new Person("Gloria", com1);

		System.out.println(p1);

		System.out.println(); System.out.println("CLONE() P1"); 
		Person p3 = (Person) p1.clone(); System.out.println("Copy : " + p3);

		System.out.println("CHANGE MANUFACTURER IN P1"); 
		p1.computer.setManufacturer("Apple"); System.out.println();


		System.out.println("Original : " + p1);

		System.out.println("Copy : " + p3);

		}
}
