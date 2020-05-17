import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee{
    private int headCount = 10;
    private ArrayList<Accountant> directReports = new ArrayList<Accountant>();
    private double bonusBudget;

    public BusinessLead(String name){
        super(name);
        setBaseSalary(getBaseSalary()*2);
        this.headCount = headCount;
    }

    public boolean hasHeadCount(){
        return directReports.size() < this.headCount;
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam){
        if (this.hasHeadCount()) {
            this.directReports.add(e);
            e.setManager(this);
            e.setTeamSupported(supportTeam);
            this.bonusBudget += e.getBaseSalary() * 1.10;
            return true;
        }else{
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus){
        if (bonus < bonusBudget) {
            e.setBaseSalary(getBaseSalary()+bonus);
            this.bonusBudget -= bonus;
            return true;
        }else{
            return false;
        }

    }

    public boolean approveBonus(Employee e, double bonus){
        if(e.getManager() !=  null) {
            for (Accountant i : directReports) {
                if (i.getTeamSupported() == e.getManager()) {
                    return i.approveBonus(bonus);
                }
            }
        }
        return this.requestBonus(e, bonus);

    }

    public String getTeamStatus(){
        if (directReports.size() == 0) {
            return super.employeeStatus() + "is managing no one.";
        }else{
            String str = "is managing " + directReports.size() +" accountants: \n";
            for (Accountant i : directReports) {
                str += i.employeeStatus() + "\n";
            }
            return super.employeeStatus() + str;
        }
    }
}
