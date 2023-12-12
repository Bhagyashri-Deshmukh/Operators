package operators;

public class InstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		Cleark cleark = new Cleark();
		
		System.out.println(employee instanceof Employee);
		System.out.println(cleark instanceof Cleark);
		
		System.out.println(employee instanceof Cleark);
		System.out.println(cleark instanceof Employee);
	}

}

interface Person{
	
}

class Employee implements Person{
	
}

class Cleark extends Employee implements Person{
	
}