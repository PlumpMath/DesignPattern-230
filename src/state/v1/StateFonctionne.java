package state.v1;

/**
 * Created by Rémy Pocquerusse on 24/11/2016.
 */
public class StateFonctionne implements StateMachine {

    @Override
    public StateMachine give(int n) throws MachineException {
        throw new MachineException("Vous ne pouvez pas donner plus d'argent, vous devez commander !");
    }

    @Override
    public StateMachine askCoffee() {
        System.out.println("Café délivré !");
        return new StateAttente();
    }

    @Override
    public StateMachine askTea() {
        System.out.println("Thé délivré !");
        return new StateAttente();
    }
}
