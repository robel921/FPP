package Lesson5HWproble6;

public class Person implements Cloneable{
	String name;

	Computer computer;

	public Person(String name, Computer computer) { super();

	this.name = name; this.computer = computer;
	}

	protected Object clone() throws CloneNotSupportedException { Person clone = (Person) super.clone();

	return clone;

	}

	@Override

	public String toString() {
	 
	return "Person [Name=" + name + ", Computer=" + computer + "]";

	}

	}

	