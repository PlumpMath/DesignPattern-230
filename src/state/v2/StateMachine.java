package state.v2;

/**
 * Created by Rémy Pocquerusse on 24/11/2016.
 */
public interface StateMachine {

    void give(MachineACafe master, int n) throws MachineException;
    void askCoffee(MachineACafe master) throws MachineException;
    void askTea(MachineACafe master) throws MachineException;
    int refund(MachineACafe master);
}
