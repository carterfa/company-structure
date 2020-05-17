import java.util.ArrayList;
public class Accountant extends BusinessEmployee {

    private double bonusBudget;
    TechnicalLead lead;
    BusinessLead manager;

    public Accountant (String name){
        super(name);
        this.bonusBudget = bonusBudget;
        this.lead = lead;
        this.manager = manager;
    }

    public void setTeamSupported(TechnicalLead lead){
        this.lead = lead;
        lead.setAccountant(this);
        supportTeam(lead);
    }

    public void setManager(BusinessLead manager){
        this.manager = manager;
    }

    public BusinessLead getManager() {
        return this.manager;
    }

    public TechnicalLead getTeamSupported() {
        return lead;
    }

    public void supportTeam(TechnicalLead lead){
        if (lead != null) {
            ArrayList<SoftwareEngineer> supportTeam = lead.getDirectReports();
            double total = 0.0;
            for (SoftwareEngineer i : supportTeam) {
                total += i.getBaseSalary() * 1.10;
            }
            this.bonusBudget += total;
        }
    }

    public boolean approveBonus(double bonus){
        if (this.lead != null) {
            if (bonus < this.bonusBudget){
                this.bonusBudget -= bonus;
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public String employeeStatus(){
        if (this.lead != null) {
            return super.employeeStatus() + "with a budget of " +this.bonusBudget+" is supporting "+this.lead.getName()+".";
        }else{
            return super.employeeStatus() + "with a budget of " +this.bonusBudget+".";
        }

    }
}
