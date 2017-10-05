/*
 * Project Name:    Capstone Lanes
 * Group:           Art Anderson, Cory Brighton, Mike Gray, Daniel Okenke
 * Purpose:         Class Container for the Individual Bowling Lanes Class
 *                  This is a simple class with attribute, constructors and methods
 *                  More advanced classes would use extentions and inheritance
 *                  This class may be instantiated in main() et.al. as a contructed array
 * Help From:       http://algs4.cs.princeton.edu/13stacks/LinkedStack.java.html
 *
 * History:         04/17/2017: AEA: Create the class with fundamental attributes
 *
*/
package CapstoneLanes;

/**
 *
 * @author CTU Capstone II - Group 2
 */
public class Lanes {

    // Declare a sequence generator to be used for the Employee ID
    public static int laneSequence;
    public static int bowlerSequence;

    // Declare Application designed Attributes
    int laneID;             // Initially set via sequence generator
    int bowlerID;           //
    int customerID;         // Matching ID from an Active Customer Class instance
    int lanePaired;         // If lane is paired, the lane # paired with
    String laneStatus;      // Active, Available, Down
    int gamesThrown;        // Incremented on the bowler's first throw per game
    int accumulatedScores;  // After each game conclusion, sum the total
    float gamesAverage;     // Average Score from all thrown games this session

    // Constructor Method sets initial values of the instantiated class
    public void Lanes(int customerID,
                      int lanePaired,
                      String laneStatus,
                      int gamesThrown,
                      int accumulatedScores) {
        this.customerID        = customerID;
        this.lanePaired        = lanePaired;
        this.laneStatus        = laneStatus;
        this.gamesThrown       = gamesThrown;
        this.accumulatedScores = accumulatedScores;
        this.gamesAverage      = accumulatedScores/gamesThrown;
    }

    // Only one setter method currently, so calculate gamesAverage
    // All interactive attributes are exposed
    // Set and Get the current Games Average
    public float setgetGamesAverage() {
        this.gamesAverage = this.accumulatedScores/this.gamesThrown;

        return this.gamesAverage;
    }

    // Getter Methods to retrieve information from the targeted class instance
    // All interactive attributes are exposed
    // Getters only used to get last sequence IDs
    // Use the toString method to "learn" the instance's ID
    // Retrieve the last sequence ID counted
    public int getLaneSequence() {
        return laneSequence;
    }

    // Retrieve the last sequence ID counted
    public int getBowlerSequence() {
        return bowlerSequence;
    }

    @Override
    public String toString() {
        // return "capstoneLanes.laneIDs[ id=" + this.laneSequence + ": " + this.bowlerSequence + " ]";
        return Integer.toString(laneSequence) + "," + Integer.toString(bowlerSequence);
    }
}
