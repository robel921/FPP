package Lesson5HWproble4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;

	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,

	double commissionRate, double baseSalary) {

	super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate); this.baseSalary = baseSalary;

	}

	@Override

	public double getPaymentAmount() {

	return getBaseSalary() + (super.getGrossSales() * super.getCommissionRate());

	}

	public double getBaseSalary() { return baseSalary;

	}

	public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary;

	}

	@Override
	 
	public String toString() {

	return "BasePlusCommissionEmployee [baseSalary=" + baseSalary + ", getGrossSales()=" + getGrossSales()

	+	", CommissionRate=" + getCommissionRate() + ", FirstName=" + getFirstName()

	+	", LastName=" + getLastName() + ", SocialSecurityNumber=" + getSocialSecurityNumber() + "]";

	}

}
