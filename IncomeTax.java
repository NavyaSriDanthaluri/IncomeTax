
public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

			
			    int monthlySalary=25000;
				int annualBasicSalary=monthlySalary*12;
				double hra=annualBasicSalary*0.2;
				double da=annualBasicSalary*0.4;
				double ta=0;
				double taxAmount;
				if(annualBasicSalary>500000)
				{
					ta=annualBasicSalary*0.1;
					System.out.println("The transport allowance is "+ta+"");
				}
				double annualSalary=(annualBasicSalary+hra+da+ta);
				if(annualSalary<500000)
				{
					System.out.println("No tax");
				}
				else if(annualSalary>=500000&&annualSalary<1000000)
				{
					taxAmount=annualSalary*0.1;
					System.out.println("Tax on "+annualSalary+" is "+taxAmount+"");
				}
				else if(annualSalary>=1000000&&annualSalary>2000000)
				{
					taxAmount=annualSalary*0.2;
					System.out.println("Tax on "+annualSalary+" is "+taxAmount+"");
				}
				else if(annualSalary>=2000000)
				{
					taxAmount=annualSalary*0.3;
					System.out.println("Tax on "+annualSalary+" is "+taxAmount+"");
				}
				// TODO Auto-generated method stub

			

		

	}

}
