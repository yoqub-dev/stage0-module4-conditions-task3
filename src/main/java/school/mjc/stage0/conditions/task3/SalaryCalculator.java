package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double taxRate;
        double netSalary;

        if (salary <= 10000 && salary >= 0) {
            System.out.println(salary-(salary*0.15));
        } else if (salary > 10000 && salary <= 20000) {
            System.out.println(salary-(salary*0.18));
        } else if (salary > 20000) {
            System.out.println(salary-(salary*0.20));
        } else {
            System.out.println("Wrong input!");
        }
    }
}
