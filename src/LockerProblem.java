import java.util.Arrays;

public class LockerProblem {
    /*
     * Write a program to simulate the following experiment.
     * You have 100 closed lockers.
     * Start with the first locker and for every locker open it.
     * Now, starting with the second locker, for this locker and
     * every second locker after that, if the locker is open, close it;
     * if it is closed, open it. Then, starting with the third locker,
     * for this locker and every third locker after that, if the locker is open, close it;
     * if it is closed, open it. Continue with the nth locker changing the
     * “position” of every nth locker until n = 100.
     *
     * Print out the locker numbers that remain open.
     */
    public static void main(String[] args){
        boolean [] locker = new boolean[100];
        boolean tmpVal = true;

        int maxLocker = locker.length;
        int incBy = 0, startPt = 0;

        // open every locker
        for (int i = 0; i < maxLocker; i++){
            locker[i] = true;
        }

        startPt = 1;
        incBy = 2;
        while (startPt < maxLocker) {
            for (int i = startPt; i < maxLocker; i += incBy) {
                tmpVal = locker[i];
                locker[i] = !tmpVal;
            }

            startPt++;
            incBy++;
        }

        for (int i = 0; i < maxLocker; i++)
            if (locker[i])
                System.out.printf("Locker #%d is opened.\n", i+1);
    }
}
