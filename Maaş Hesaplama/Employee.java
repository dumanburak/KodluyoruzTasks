
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	double tax,bonus,raise;
	
	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	void tax() {
		tax = salary * 0.03;
	}
	
	void bonus() {
		if (workHours > 40) 
			bonus = (workHours - 40) * 30;
	}
	
	void raise() {
		if (2022 - hireYear < 10 )
			raise = salary * 0.05;
		else if (2022 - hireYear < 20)
			raise = salary * 0.1;
		else
			raise = salary * 0.15;
	}
	
	void info () {
		System.out.println("Adý : "+ name);
		System.out.println("Maaþý : " + salary);
		System.out.println("Çalýþma Saati : " + workHours);
		System.out.println("Baþlangýç Yýlý " + hireYear);
		System.out.println("Vergi : " + tax);
		System.out.println("Bonus : " + bonus);
		System.out.println("Maaþ Artýþý : " + raise);
		System.out.println("Vergi ve Bonuslar ile birlikte maaþ : " + (salary + bonus - tax));
		System.out.println("Toplam Maaþ : " + ((salary + bonus - tax) + raise));
		
	}
}
