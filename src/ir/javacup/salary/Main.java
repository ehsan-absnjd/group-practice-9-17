package ir.javacup.salary;

import ir.javacup.salary.HrmSalaryListCreator;
import ir.javacup.salary.SalaryListCreator;

public class Main {
    public static void main(String[] args) {

        HrmSalaryListCreator creator = new HrmSalaryListCreator(null);
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("71235", 1_500_000);
        employees[1] = new Employee("03451", 3_200_000);
        System.out.println(creator.doCreate(employees));

        FmSalaryListCreator creator2 = new FmSalaryListCreator(null);
        Employee[] employees2 = new Employee[2];
        employees2[0] = new Employee("31235", 2_000_000);
        employees2[1] = new Employee("00531", 1_200_000);
        System.out.println(creator2.doCreate(employees2));

    }
}
