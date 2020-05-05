import java.util.ArrayList;

public class RepairSchedule {
    /**
     * Each element represents a repair by an individual mechanic
     * in a bay.
     */
    private ArrayList<CarRepair> schedule;

    /**
     * Number of mechanics available in this schedule.
     */
    private int numberOfMechanics;


    /**
     * Constructs a RepairSchedule object.
     * Precondition: n >= 0
     */
    public RepairSchedule(int n) {
        schedule = new ArrayList<CarRepair>();
        numberOfMechanics = n;
    }


    /**
     * Attempts to schedule a repair by a given mechanic in a
     * given bay as described in part (a).
     * Precondition: 0 <= m < numberOfMechanics and b >= 0
     */
    public boolean addRepair(int m, int b) {
        /* to be implemented in part (a) */
        for (int i = 0; i < schedule.size(); i++) {
            if (schedule.get(i).getMechanicNum() == m) {
                return false;
            } else if (schedule.get(i).getBayNum() == b) {
                return false;
            }
        }
        return true;
    }


    /**
     * Returns an ArrayList containing the mechanic identifiers of
     * all available mechanics,
     * as described in part (b).
     */
    public ArrayList<Integer> availableMechanics() {
        /* to be implemented in part (b) */
        ArrayList<Integer> availableMechanic = new ArrayList<>();
        Boolean mechanicAvailable = Boolean.TRUE;

        for (int i = 0; i < numberOfMechanics; i++) {
            for (int i2 = 0; i2 < schedule.size(); i2++) {
                if (schedule.get(i2).getMechanicNum() == i) {
                    mechanicAvailable = Boolean.FALSE;
                    break;
                } else if (schedule.get(i2).getMechanicNum() != i) {
                    mechanicAvailable = Boolean.TRUE;
                }
            }
            if (mechanicAvailable = Boolean.TRUE) {
                availableMechanic.add(i);
            }

        }
        return availableMechanic;
    }


    /**
     * Removes an element from schedule when a repair is complete
     * Only to be used by the driver
     */
    public void carOut(int b) {
        for (int i = schedule.size() - 1; i >= 0; i--) {
            if (schedule.get(i).getBayNum() == b) {
                schedule.remove(i);
            }
        }
    }

}

