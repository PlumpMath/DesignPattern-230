package state.v2;

/**
 * Created by Rémy Pocquerusse on 24/11/2016.
 */
public class StateFonctionne implements StateMachine {

    private int credit;

    public StateFonctionne(int credit) {
        this.credit = credit;
    }

    @Override
    public void give(MachineACafe master, int n) throws MachineException {
        throw new MachineException("Vous ne pouvez pas donner plus d'argent, vous devez commander !");
    }

    @Override
    public void askCoffee(MachineACafe master) {
        System.out.println("Café délivré !");
        credit -= 10;
        if(credit < 10) {
            master.setStateMachine(new StateAttente(credit));
        }
    }

    @Override
    public void askTea(MachineACafe master) {
        System.out.println("Thé délivré !");
        credit -= 10;
        if(credit < 10) {
            master.setStateMachine(new StateAttente(credit));
        }
    }

    @Override
    public int refund(MachineACafe master) {
        int c = credit;
        credit = 0;
        System.out.println("Rendu : " + c);
        master.setStateMachine(new StateAttente(credit));
        return c;
    }
}
