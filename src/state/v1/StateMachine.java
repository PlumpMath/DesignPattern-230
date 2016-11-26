package state.v1;

/**
 * Created by Rémy Pocquerusse on 24/11/2016.
 */
public interface StateMachine {

    StateMachine give(int n) throws MachineException;
    StateMachine askCoffee() throws MachineException;
    StateMachine askTea() throws MachineException;
}
