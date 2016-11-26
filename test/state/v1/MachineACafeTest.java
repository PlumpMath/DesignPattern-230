package state.v1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Rémy Pocquerusse on 24/11/2016.
 */
public class MachineACafeTest {

    MachineACafe machineACafe;

    @BeforeMethod
    public void setUp() throws Exception {
        machineACafe = new MachineACafe();
    }

    @AfterMethod
    public void tearDown() throws Exception {
        machineACafe = null;
    }

    @Test
    public void testMachineAskTea() throws Exception {
        machineACafe.give(5);
        try {
            machineACafe.askTea();
            fail();
        } catch(MachineException e) {
        }
        machineACafe.give(9);
        try {
            machineACafe.askTea();
            fail();
        } catch(MachineException e) {
        }
        machineACafe.give(30);
        try {
            machineACafe.askTea();
        } catch(MachineException e) {
            fail();
        }
        try {
            machineACafe.askTea();
            fail();
        } catch(MachineException e) {
        }
    }

    @Test
    public void testMachineAskCoffee() throws Exception {
        machineACafe.give(7);
        try {
            machineACafe.askCoffee();
            fail();
        } catch(MachineException e) {
        }
        machineACafe.give(8);
        try {
            machineACafe.askCoffee();
            fail();
        } catch(MachineException e) {
        }
        machineACafe.give(30);
        try {
            machineACafe.askCoffee();
        } catch(MachineException e) {
            fail();
        }
        try {
            machineACafe.askCoffee();
            fail();
        } catch(MachineException e) {
        }
    }
}