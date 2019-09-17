package Lesson8HW;

class Person {
	private String lastName;
	private String firstName;
	private int age;

	public Person(String last, String first, int a) {
		
		lastName = last;
		firstName = first;
		age = a;
	}

	public String getLast()
	
	{
		return lastName;
	}

	@Override
	public String toString() {
		return "Person [lastName=" + lastName + "\n FirstName=" + firstName + "\nAge=" + age + "]";
	}
	
}

public class MyPersonList {
	private final int INITIAL_LENGTH = 3;
	private Person[] PersonArray;
	private int size;

	
	public MyPersonList() {
		PersonArray = new Person[INITIAL_LENGTH];
		size = 0;
	}

	
	public void add(Person s) {
		if (size == PersonArray.length)
			resize();
		PersonArray[size++] = s;
	}

	
	public Person get(int i) {
		if (i < 0 || i >= size) {
			return null;
		}
		return PersonArray[i];
	}

	
	public boolean find(String lastName) {
		for (Person test : PersonArray) {
			if (test != null) {
				if (test.getLast().equals(lastName))
					return true;
			}
		}
		return false;
	}
 
	public void insert(Person s, int pos) {
		if (pos > size)
			return;
		if (pos >= PersonArray.length || size + 1 > PersonArray.length) {
			resize();
		}
		Person[] temp = new Person[PersonArray.length + 1];
		System.arraycopy(PersonArray, 0, temp, 0, pos);
		temp[pos] = s;
		System.arraycopy(PersonArray, pos, temp, pos + 1, PersonArray.length - pos);
		PersonArray = temp;
		++size;
	}
  
	public boolean remove(String lastName) {
		if (size == 0)
			return false;
		int index = -1;
		for (int i = 0; i < size; ++i) {
			if (PersonArray[i].getLast().equals(lastName)) {
				index = i;
				break;
			}
		}
		if (index == -1)
			return false;
		Person[] temp = new Person[PersonArray.length];
		System.arraycopy(PersonArray, 0, temp, 0, index);
		System.arraycopy(PersonArray, index + 1, temp, index, PersonArray.length - (index + 1));
		PersonArray = temp;
		--size;
		return true;
	}
  
	private void resize() {
		System.out.println("Resizing");
		int len = PersonArray.length;
		int newlen = 2 * len;
		Person[] temp = new Person[newlen];
		System.arraycopy(PersonArray, 0, temp, 0, len);
		PersonArray = temp;
	}
   
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(PersonArray[i] + ", \n");
		}
		sb.append(PersonArray[size - 1] + "]");
		return sb.toString();
	}
  
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyPersonList list = new MyPersonList();
		list.add(new Person("Robel", "Tecleyesus", 27));
		list.add(new Person("Yosan", "Alem", 22));
		list.add(new Person("Abiel", "Abraha", 24));
		list.add(new Person("Sham", "Kidane", 32));
		System.out.println("\n Size() : " + list.size() + " is\n " + list);
		list.remove("Tecleyesus");
		System.out.println("\n Size() : " + list.size() + " is \n" + list);
		list.insert(new Person("luwam", "Tesfamariam", 29), 1);
		System.out.println("\n Searching of Lermon: " + list.find("Robi"));
		System.out.println(list.get(2));
	}
}