public class TechnicalLead extends TechnicalEmployee{
    private int headCount;
    public TechnicalLead(String name){
        super(name);

        this.headCount = 4;
    }

    public boolean hasHeadCount(){
        return 4 < this.headCount;
    }

    public boolean addReport(SoftwareEngineer e){

        return false;
    }

    public boolean approveCheckIn(SoftwareEngineer e){
        return true;
    }

    public boolean requestBonus(Employee e, double bonus){
        return false;
    }

    public String getTeamStatus(){
        return "";
    }
}
