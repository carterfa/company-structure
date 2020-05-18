import java.util.ArrayList;

public class TechnicalLead extends TechnicalEmployee{
    private final int headCount = 4;
    private final ArrayList<SoftwareEngineer> directReports = new ArrayList<SoftwareEngineer>();
    private Accountant accountant;

    public TechnicalLead(String name){
        super(name);
        setBaseSalary(getBaseSalary()*1.3);
    }

    public void setAccountant(Accountant accountant){
        this.accountant = accountant;
    }

    public boolean hasHeadCount(){
        return directReports.size() < this.headCount;
    }

    public boolean addReport(SoftwareEngineer e){
        if (this.hasHeadCount()) {
            directReports.add(e);
            e.setManager(this);
            return true;
        }else{
            return false;
        }
    }

    public boolean approveCheckIn(SoftwareEngineer e){
        return (e.getCodeAccess() && e.getManager() == this);
    }

    public boolean requestBonus(Employee e, double bonus){
        BusinessLead bl = this.accountant.getManager();
        if (bl.approveBonus(e,bonus)){
            setBaseSalary(getBaseSalary()+bonus);
            return true;
        }else{
            return false;
        }
    }

    public String getTeamStatus(){
        if (directReports.size() == 0) {
            return super.employeeStatus() + "is managing no one.";
        }else{
            StringBuilder str = new StringBuilder("is managing " + directReports.size() + " software engineers: \n");
            for (SoftwareEngineer i : directReports) {
                str.append(i.employeeStatus()).append("\n");
            }
            return super.employeeStatus() + str;
        }
    }

    public ArrayList<SoftwareEngineer> getDirectReports() {
        return directReports;
    }

}
