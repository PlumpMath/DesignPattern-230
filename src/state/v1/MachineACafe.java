package state.v1;

/**
 * On simule une machine à café qui ne rend pas la monnaie. Si le crédit alloué (un café/thé coûte 10)
 * est insuffisant alors on réinitialise le crédit à 0.
 */
public class MachineACafe {

    StateMachine stateMachine;

    public MachineACafe() {
        stateMachine = new StateAttente();
    }

    public void give(int n) throws MachineException {
        stateMachine = stateMachine.give(n);
    }

    public void askCoffee() throws MachineException {
        stateMachine = stateMachine.askCoffee();
    }

    public void askTea() throws MachineException {
        stateMachine = stateMachine.askTea();
    }
}
