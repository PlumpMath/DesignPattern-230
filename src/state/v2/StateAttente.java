package state.v2;

/**
 * Created by Rémy Pocquerusse on 24/11/2016.
 */
public class StateAttente implements StateMachine {

    private int credit;

    public StateAttente(int credit) {
        this.credit = credit;
    }

    @Override
    public void give(MachineACafe master, int n) {
        credit += n;
        if(credit < 10) {
            master.setStateMachine(new StateAttente(credit));
        } else {
            master.setStateMachine(new StateFonctionne(credit));
        }
    }

    @Override
    public void askCoffee(MachineACafe master) throws MachineException {
        throw new MachineException("Impossible de commander un café !");
    }

    @Override
    public void askTea(MachineACafe master) throws MachineException {
        throw new MachineException("Impossible de commander un thé !");
    }

    @Override
    public int refund(MachineACafe master) {
        int c = credit;
        credit = 0;
        System.out.println("Rendu : " + c);
        return c;
    }
}
