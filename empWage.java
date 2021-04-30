public class empWage{

   public static final int EMP_WAGE_PER_HOUR = 20;
   public static final int IS_FULL_TIME = 1;
   public static final int IS_PART_TIME = 2;

   public static void calculate_wage(){

      int empWage, empHour ;

      int check = (int)Math.floor(Math.random() * 10) % 3;

      if (check == IS_FULL_TIME){
         System.out.println("Employee is present");
         empHour = 8 ;
      }
      else if( check == IS_PART_TIME){
         empHour = 4;
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
