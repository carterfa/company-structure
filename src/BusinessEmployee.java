public abstract class BusinessEmployee extends Employee {

    protected double bonusBudget;

    public BusinessEmployee(String name) {
        super(name, 50000);
    }

    public double getBonusBudget() {
        return this.bonusBudget;
    }

    public String employeeStatus() {
        return super.employeeStatus();
    }
}
