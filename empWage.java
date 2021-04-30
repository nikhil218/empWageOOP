public class empWage{

	public static void Attendance_check(){

		int check = (int)Math.floor(Math.random() * 10) % 2;

		if (check == 1){
			System.out.println("Employee is present");
		}
		else{
			System.out.println("Employee is absent");
		}
	}

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation problem using OOPs");

		Attendance_check();
	}
}
