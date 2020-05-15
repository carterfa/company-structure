public class SoftwareEngineer extends TechnicalEmployee{

    private int checkIns = 0;
    private boolean codeAccess = false;

    public SoftwareEngineer (String name){
        super(name);
        int checkIns = this.checkIns;
    }

    public boolean getCodeAccess(){
        return this.codeAccess;
    }

    public void setCodeAccess(boolean access){
        this.codeAccess = access;
    }

    public int getSuccessfulCheckIns(){
        return this.checkIns;
    }

    public boolean checkInCode(){
        return false;
    }
}
