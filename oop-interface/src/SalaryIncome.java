
public class SalaryIncome implements Income{

	// TODO
	public double income;
	public SalaryIncome(double income) {
		this.income = income;
	}
	
	@Override
	public double getTax() {
		if(income >= 5000) {
			return (income - 5000) * 0.2;
		}
		return 0;
	}

}
