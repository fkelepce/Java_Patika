public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    Employee(String name, int salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double tax(){
        double tax=0.0;
        if (this.salary<1000){
            System.out.println("No tax for this salary range");
        }else{
            tax=this.salary*0.03;
        }
        return tax;
    }
    int bonus(){
        int bonus=0;
        if (this.workHours>40){
            bonus=(this.workHours-40)*30;
        }
        return bonus;
    }
    double raiseSalary(){
        int currentYear = 2021;
        int workingYear= currentYear-this.hireYear;
        double increase=0.0;
        if(workingYear<10){
            increase=this.salary*0.05;
            return increase;
        } else if (workingYear>9 && workingYear<20 ) {
            increase=(this.salary*0.1);
            return increase;
        } else if (workingYear>19) {
            increase=(this.salary*0.15);
            return increase;
        }
        return increase;
    }
    void info(){
        double taxAndBonus=this.salary+bonus()-tax();
        double totalSalary=this.salary+raiseSalary();
        System.out.println("Name: "+ this.name);
        System.out.println("Salary: "+ this.salary);
        System.out.println("Working hours: "+ this.workHours);
        System.out.println("Starting year: "+ this.hireYear);
        System.out.println("Tax: "+ this.tax());
        System.out.println("Bonus: "+ this.bonus());
        System.out.println("Salary increase: "+ this.raiseSalary());
        System.out.println("The salary (tax and bonus included): "+taxAndBonus );
        System.out.println("Total salary will be: " +totalSalary);
    }
}