
public class testPolymorphic {
	public static double totalTax(Income...incomes) {
		double total = 0;
		for(Income income :incomes) {
			total = total + income.getTax();
		}
		return total;
	}
	public static void main(String[] args) {
		Income[] incomes = new Income[] {
				new Income(3000),
				new Salary(7500),
				new  StateCouncilSpacialAllowance(150000)
		};
		System.out.println(totalTax(incomes));
	}
}

//原本的税率
class Income{
	protected double income;
	public double getTax() {
		return income * 0.1;
	}
	public Income(double income) {
		this.income = income;
	}
}
//工资收入-基数
class Salary extends Income {
	
	public Salary(double income) {
		super(income);
	}
	
	@Override
	public double getTax() {
		if(income <= 5000) {
			return 0;
		}
		return (income - 5000) * 0.2;
	}
}
//免税
class StateCouncilSpacialAllowance extends Income {
	public  StateCouncilSpacialAllowance(double income) {
		super(income);
	}
	@Override
	public double getTax() {
		return 0;
	}
}
