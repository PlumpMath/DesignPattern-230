package state.v2;

/**
 * On simule une machine à café qui ne rend pas la monnaie. Si le crédit alloué (un café/thé coûte 10)
 * est insuffisant alors on réinitialise le crédit à 0.
 */
public class MachineACafe {

    StateMachine stateMachine;

    public MachineACafe() {
        stateMachine = new StateAttente(0);
    }

    public void give(int n) throws MachineException {
        stateMachine.give(this, n);
    }

    public void askCoffee() throws MachineException {
        stateMachine.askCoffee(this);
    }

    public void askTea() throws MachineException {
        stateMachine.askTea(this);
    }

    public int refund() {
        int credit = stateMachine.refund(this);
        return credit;
    }

    public void setStateMachine(StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    public static void main(String[] args) throws MachineException {
        MachineACafe machineACafe = new MachineACafe();
        machineACafe.give(23);
        machineACafe.askCoffee();
        machineACafe.askCoffee();
        machineACafe.refund();
    }
}
