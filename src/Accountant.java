public class Accountant extends BusinessEmployee {

    private double bonusBudget;

    public Accountant (String name){
        super(name);
        this.bonusBudget = 0.0;
    }

    public TechnicalLead getTeamSupported() {
        return null;
    }

    public void supportTeam(TechnicalLead lead){
        this.bonusBudget = bonusBudget + 1.0;
    }

    public boolean approveBonus(double bonus){
        return bonus > 5.0;
    }
}
