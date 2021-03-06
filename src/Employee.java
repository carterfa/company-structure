public abstract class Employee {

    private String name;
    private double baseSalary;
    private static int numOfEmployees;
    private int employeeID;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        numOfEmployees++;
        this.employeeID = numOfEmployees;
    }

    public double getBaseSalary(){
        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return this.name;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public Employee getManager(){
        return null;
    }

    public boolean equals(Employee other){
        return this.employeeID == other.employeeID;
    }

    public String toString(){
        return this.employeeID +" "+ this.name;
    }

    public String employeeStatus(){
        return this.employeeID +" " +this.name + " ";
    }

}
