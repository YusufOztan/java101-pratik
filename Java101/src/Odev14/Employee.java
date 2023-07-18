package Odev14;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name, double salary,int workHours,int hireYear ){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (this.salary>1000) {
            double tax = this.salary * 0.03;
            return tax;
        }
        return 0;
    }

    int bonus(){
        if(this.workHours>=40){
            int diff = this.workHours - 40;
            diff *= 30;
            return diff;
        }
        return 0;
    }

    double raiseSalary(){
        int now = 2021;
        double raise;
        if(now-this.hireYear<10){
            raise = this.salary * 0.05;
            System.out.println(raise);
            return raise;
        } else if((now-this.hireYear>9) && (now-this.hireYear<20)){
            raise = this.salary * 0.10;
            System.out.println(raise);
            return raise;
        } else if(now-this.hireYear>19){
            raise = this.salary * 0.15;
            System.out.println(raise);
            return raise;
        }
        return 0;
    }
    public String toString(){
        System.out.println("Name \t: " + this.name);
        System.out.println("Salary \t: " + this.salary);
        System.out.println("Work Hours \t: " + this.workHours);
        System.out.println("Hire Year \t: " + this.hireYear);
        System.out.println("Tax \t: " + tax());
        System.out.println("Bonus \t: " + bonus());
        System.out.println("Salary with Taxes and Bonuses \t: " + (this.salary - tax() + bonus()));
        System.out.println("Salary Raise \t: " + raiseSalary());
        System.out.println("Total Salary \t: " + + (this.salary - tax() + bonus() + raiseSalary()));
        return null;
    }

}

