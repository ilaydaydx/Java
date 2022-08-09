public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            double tax = salary * 0.03;
            return tax;
        }
    }

    public double bonus() {
        if (this.workHours <= 40) {
            return 0;
        } else {
            int bonus = (workHours - 40) * 30;
            return bonus;
        }
    }

    public double raiseSalary() {
        if (hireYear <= 0 || hireYear > 2021) {
            System.out.println("You entered an invalid working year, check again!");
        } else {
            int fark = 2021 - hireYear;
            double raise;

            if (fark > 0 && fark < 10) {
                raise = salary * 0.05;
                return raise;
            } else if (fark > 9 && fark < 20) {
                raise = salary * 0.1;
                return raise;
            } else if (fark > 19) {
                raise = salary * 0.15;
                return raise;
            } else if (fark == 0) {
                return 0;
            }
        }
        return 0;
    }

    public String toString() {
        double total = salary - tax() + bonus() + raiseSalary();
        double tot = salary + bonus() - tax();
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Weekly working hours: " + this.workHours);
        System.out.println("Start year of hire: " + this.hireYear);
        System.out.println("Tex: " + tax());
        System.out.println("Bonus:" + bonus());
        System.out.println("Salary increase amount: " + raiseSalary());
        System.out.println("Salary with Taxes and Bonuses: " + tot);
        System.out.println("Total Salery: " + total);

        return null;
    }
}
