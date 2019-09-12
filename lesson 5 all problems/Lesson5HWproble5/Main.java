package Lesson5HWproble5;

public class Main {

	public static void main(String[] args) {
		Computer com1 = new Computer("HP", "Intel Core I5", 8, 650, 2.30); Computer com2 = new Computer("Lenevo", "Intel Core I7", 8, 1024, 2.50); Computer com3 = new Computer("acer", "Intel Core I5", 8, 512, 2.30); System.out.println(com1);

		System.out.println(com2);

		System.out.println(com3);

		System.out.println();

		System.out.println("============================="); 
		System.out.println("hascode com1: " + com1.hashCode()); 
		System.out.println("hascode com2: " + com2.hashCode()); 
		System.out.println("hascode com3: " + com3.hashCode());
		 System.out.println("============================="); System.out.println();
		System.out.println();

		System.out.println("com1 equals com2? : " + com1.equals(com2)); 
		System.out.println("com1 equals com3? : " + com1.equals(com3));
		}


	}


