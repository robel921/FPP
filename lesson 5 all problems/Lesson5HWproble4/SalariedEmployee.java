package Lesson5HWproble4;

public class SalariedEmployee extends Employee{
	private double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) { super(firstName, lastName, socialSecurityNumber);

	this.weeklySalary = weeklySalary;

	}

	@Override

	public double getPaymentAmount() { return getWeeklySalary();

	}

	public double getWeeklySalary() { return weeklySalary;

	}

	public void setWeeklySalary(double weeklySalary) { this.weeklySalary = weeklySalary;

	}

	@Override

	public String toString() {

	return "SalariedEmployee [weeklySalary=" + weeklySalary + ", FirstName=" + getFirstName()

	+ ",LastName=" + getLastName() + ", SocialSecurityNumber=" + getSocialSecurityNumber() + "]";

	}

}
