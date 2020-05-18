import java.util.ArrayList;

public class BusinessLead extends BusinessEmployee{
    private final int headCount = 10;
    private final ArrayList<Accountant> directReports = new ArrayList<Accountant>();

    public BusinessLead(String name){
        super(name);
        setBaseSalary(getBaseSalary()*2);
    }

    public boolean hasHeadCount(){
        return directReports.size() < this.headCount;
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam){
        if (this.hasHeadCount()) {
            this.directReports.add(e);
            e.setManager(this);
            e.setTeamSupported(supportTeam);
            this.setBonusBudget(this.getBonusBudget() + (e.getBaseSalary() * 0.1));
            return true;
        }else{
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus){
        if (bonus < this.getBonusBudget()) {
            e.setBaseSalary(getBaseSalary()+bonus);
            this.setBonusBudget(this.getBonusBudget() - bonus);
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
            StringBuilder str = new StringBuilder(" is managing " + directReports.size() + " accountants: \n");
            for (Accountant i : directReports) {
                str.append(i.employeeStatus()).append("\n");
            }
            return super.employeeStatus() + str;
        }
    }
}
