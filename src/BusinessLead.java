public class BusinessLead extends BusinessEmployee{
    private int headCount;
    public BusinessLead(String name){
        super(name);
        this.headCount = 4;
    }

    public boolean hasHeadCount(){
        return 4 < this.headCount;
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam){
        return false;
    }

    public boolean requestBonus(Employee e, double bonus){
        return false;
    }

    public boolean approveBonus(Employee e, double bonus){
        return true;
    }
}
