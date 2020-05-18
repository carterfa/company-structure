public abstract class BusinessEmployee extends Employee {

    private double bonusBudget;

    public BusinessEmployee(String name) {
        super(name, 50000);
    }

    public double getBonusBudget() {
        return this.bonusBudget;
    }

    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }

    public String employeeStatus() {
        return super.employeeStatus()+ "with a budget of " +this.getBonusBudget();
    }
}
