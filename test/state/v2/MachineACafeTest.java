package state.v2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Rémy Pocquerusse on 25/11/2016.
 */
public class MachineACafeTest {

    MachineACafe machineACafe;

    @BeforeMethod
    public void setUp() throws Exception {
        machineACafe = new MachineACafe();
    }

    @Test
    public void testMachineAskCoffee() {
        try {
            machineACafe.give(5);
        } catch (MachineException e) {
            fail();
        }
        try {
            machineACafe.askCoffee();
            fail();
        } catch (MachineException e) {
        }
        try {
            machineACafe.give(8);
        } catch (MachineException e) {
            fail();
        }
        try {
            machineACafe.askCoffee();
        } catch (MachineException e) {
            fail();
        }
        assertEquals(machineACafe.refund(), 3);
    }

    @Test
    public void testMachineAskTea() {
        try {
            machineACafe.give(7);
        } catch (MachineException e) {
            fail();
        }
        try {
            machineACafe.askTea();
            fail();
        } catch (MachineException e) {
        }
        try {
            machineACafe.give(8);
        } catch (MachineException e) {
            fail();
        }
        try {
            machineACafe.askTea();
        } catch (MachineException e) {
            fail();
        }
        assertEquals(machineACafe.refund(), 5);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        machineACafe = null;
    }
}