package state.v1;

/**
 * Created by Rémy Pocquerusse on 24/11/2016.
 */
public class StateAttente implements StateMachine {

    private int credit;

    public StateAttente() {
        this.credit = 0;
    }

    @Override
    public StateMachine give(int n) {
        credit += n;
        if(credit < 10) {
            return new StateAttente();
        }
        return new StateFonctionne();
    }

    @Override
    public StateMachine askCoffee() throws MachineException {
        throw new MachineException("Impossible de commander un café !");
    }

    @Override
    public StateMachine askTea() throws MachineException {
        throw new MachineException("Impossible de commander un thé !");
    }
}
