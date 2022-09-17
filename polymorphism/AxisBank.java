package polymorphism;

public class AxisBank extends BankInfo {
	

		public void saving(float interest) {
			System.out.println("The interest percentage for Savings Account is" + " " + interest);
		}
		
		public void fixed(float interest) {
			System.out.println("The interest percentage for Fixed Depost is "+ " " + interest);

		}
		
		public void deposit(int amount) {
			System.out.println("The maximum vlue of deposit Amount is " + " " + amount);
		}

	public static void main(String[] args) {
		AxisBank details = new AxisBank();
		details.saving(8.2f);
		details.fixed(6.5f);
		details.deposit(45000);
	}

}
