package EmployeeManagementSystem;
import java.util.Scanner;

public class Main {
	EmployeeService Service=new EmployeeService();
	static boolean ordering=true;
	public static void menu()
	{
		System.out.println("===========Welcome To Employee Management System=============");
		System.out.println("1.Add Employee");
		System.out.println("2.View Employee");
		System.out.println("3.Update Employee");
		System.out.println("4.Delete Employee");
		System.out.println("5.View All Employee");
		System.out.println("6.Exist");
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService service=new EmployeeService();
		
		do
		{  
			menu();
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("Add Employee");
				service.addEmp();
				break;
				
			case 2:
				System.out.println("View Employee By id");
				service.viewEmp();
				break;
			case 3:
				System.out.println("Update Employee");
				service.updateEmployee();
				break;
			case 4:
				System.out.println("Delete Employee");
				service.deleteEmp();
				break;
			case 5:
				System.out.println("View All Employee");
				service.viewAllEmps();
				break;
			case 6:
				System.out.println("Thank You For Using Application!!");
				System.exit(0);
				default:
					System.out.println("Please Enter Valid Choice");
					break;
			
			}
		}while(ordering);

	}

}
