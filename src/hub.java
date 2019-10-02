import java.util.Scanner;

public class hub
{
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input how many hours you worked the past week: ");



        double hourlyWage=9.25;

        double workHours;
        double pay;




        while(scanner.hasNextDouble())
        {
            workHours=scanner.nextDouble();

            double overtimeWage=hourlyWage*1.5;
            if(workHours<=40) {
                pay = hourlyWage * workHours;
                System.out.println("Paycheck: "+pay+"$");
            }
            else if(workHours>40)
            {
                double overtime=workHours-40;
                workHours = workHours - overtime;
                double overtimepay=overtime*overtimeWage;
                pay=overtimepay+(workHours*hourlyWage);
                System.out.println("Paycheck: "+pay+"$");

            }


        }




    }

}
