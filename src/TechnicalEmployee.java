public abstract class TechnicalEmployee extends Employee{

    public TechnicalEmployee(String name){
        super(name, 75000);
    }

    public double getBonusBudget(){
        return 0.0;
    }

    public String employeeStatus(){
        return "";
    }
}
