package org.emp;

public class Employee {

private void empId(){
	System.out.println("8319");
}
private void empName() {
	System.out.println("raji");
}
private void empDob() {
	System.out.println("5-8-1994");
	}
private void empPhone() {
    System.out.println("9080362066");
	}
private void empEmail() {
	System.out.println("rajibnec@gmail.com");
	}
private void empAddress() {
	System.out.println("krishna nagar");
}
public static void main(String[] args) {
	Employee empl= new Employee();
	empl.empId();
	empl.empName();
	empl.empDob();
	empl.empPhone();
	empl.empEmail();
	empl.empAddress();
}
}

