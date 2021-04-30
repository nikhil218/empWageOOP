public class empWage{

   public static final int EMP_WAGE_PER_HOUR = 20;

   public static void calculate_wage(){

      int empWage, empHour ;

      int check = (int)Math.floor(Math.random() * 10) % 2;

      if (check == 1){
         System.out.println("Employee is present");
         empHour = 8 ;
      }
      else{
         System.out.println("Employee is absent");
         empHour = 0 ;
      }
      empWage = EMP_WAGE_PER_HOUR*empHour;
      System.out.println("Daily Wage of an Employee is : " + empWage);
   }

   public static void main(String[] args){
      System.out.println("Welcome to Employee Wage Computation problem using OOPs");

      calculate_wage();
   }
}
