public class SoftwareEngineer extends TechnicalEmployee{

    private int checkIns = 0;
    private boolean codeAccess = false;
    private TechnicalLead manager;

    public SoftwareEngineer (String name){
        super(name);
    }

    public boolean getCodeAccess(){
        return this.codeAccess;
    }

    public void setCodeAccess(boolean access){
        this.codeAccess = access;
    }

    public void setManager(TechnicalLead manager){
        this.manager = manager;
    }

    public TechnicalLead getManager() {
        return this.manager;
    }

    public int getSuccessfulCheckIns(){
        return this.checkIns;
    }

    public boolean checkInCode(){
        if (this.manager == null){
            return false;
        }else {
            if (this.manager.approveCheckIn(this)) {
                checkIns++;
                return true;
            } else {
                return false;
            }
        }
    }

    public String employeeStatus(){
        return super.employeeStatus() + "has had " +this.checkIns+" successful check in(s).";
    }
}
