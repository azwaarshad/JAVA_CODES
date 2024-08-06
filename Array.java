
public class Array {
	Employee employees[];
	int size;
	int count=0;
	
	Array(int size){
		this.size = size;
		employees = new Employee[size];
	}
	
	void addEmp(Employee emp) {
		if(count==size) {
			System.out.println("Array is out of bound");
		}
		else {
			employees[count] = emp;
			count++;
		}
	}
	
	void displayInfo() {
		if(count==0) {
			System.out.println("No employees added");
		}
		else {
			System.out.println("Details of Employees");
			for(int i=0; i<count; i++) {
				System.out.println("Name: " + employees[i].name + "\n" + "Designation: " + employees[i].designation);
			}
		}
	}
	
	void delEmp(String empName) {
		boolean found = false;
		for(int i; i<count; i++) {
			 if (employees[i].name.equals(empName)) {
				 for(int j=i; j<count-1; j++) {
					 employees[j] = employees[j+1];
				 }
				 count--;
				 found = true;
				 break;
			 }
		}
		if(found) {
			System.out.println(empName + " has been deleted successfully");
		}
		else {
			System.out.println(empName + " not found");
		}
	}
}
