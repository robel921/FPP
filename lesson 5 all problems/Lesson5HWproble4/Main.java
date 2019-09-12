package Lesson5HWproble4;

public class Main {

	public static void main(String[] args) {
		Employee em1 = new CommissionEmployee("sammy", "yoni", "710450745", 15000, 2); 
		Employee em2 = new HourlyEmployee("Ama", "johnny", "18829344972", 13000, 0.2); 
		Employee em3 = new SalariedEmployee("wedi shuk", "hisheki", "567438939", 6000);
		Employee em4 = new BasePlusCommissionEmployee("bini", "jirom", "3423456", 45000, 0.3, 1); 


		Employee[] Pay = new Employee[4]; 
		Pay[0] = em1;
		Pay[1] = em2; 
		Pay[2] = em3; 
		Pay[3] = em4; 
		double sum = 0;
		for (Employee payable : Pay) { System.out.println(payable);
		System.out.println("PaymentAmount= " + payable.getPaymentAmount()); if (payable instanceof Employee)

		sum = sum + payable.getPaymentAmount();

		}

		System.out.println(); System.out.println("Sum of all Employee:"); System.out.println(sum);


	}

}
