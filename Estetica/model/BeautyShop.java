package model;

public class BeautyShop{

	private Employee emplo1;

	private Employee emplo2;



	//Methods


public void registerService(int serviceOption, int employeeOption, int amountTimesService){
	if (employeeOption == 1){
		if (serviceOption== 1){
			int beforeAmount = emplo1.getS1().getNtimes();
			emplo1.getS1().setNtimes(beforeAmount + amountTimesService);
		}else if (serviceOption == 2){
			int beforeAmount2 = emplo1.getS2().getNtimes();
			emplo1.getS2().setNtimes(beforeAmount2 + amountTimesService);
		}else if (serviceOption == 3){
			int beforeAmount3 = emplo1.getS3().getNtimes();
			emplo1.getS3().setNtimes(beforeAmount3 + amountTimesService);
		}
	}else if(employeeOption == 2){
		if (serviceOption== 1){
			int beforeAmount = emplo1.getS1().getNtimes();
			emplo1.getS1().setNtimes(beforeAmount + amountTimesService);
		}else if (serviceOption == 2){
			int beforeAmount2 = emplo1.getS2().getNtimes();
			emplo1.getS2().setNtimes(beforeAmount2 + amountTimesService);
		}else if (serviceOption == 3){
			int beforeAmount3 = emplo1.getS3().getNtimes();
			emplo1.getS3().setNtimes(beforeAmount3 + amountTimesService);
		}
	}else{
		System.out.println("Por favor digite una opcion valida.");
	}
}

	public BeautyShop(Employee emplo1, Employee emplo2){

		this.emplo1 = emplo1;

		this.emplo2 = emplo2;
	}

	public Employee getEmplo1(){

		return emplo1;
	}

	public void setEmplo1(Employee emplo1){

		this.emplo1 = emplo1;
	}

	public Employee getEmplo2(){

		return emplo2;
	}

	public void setEmplo2(Employee emplo2){

		this.emplo2 = emplo2;
	}
}