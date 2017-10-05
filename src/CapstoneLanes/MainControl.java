/*
 * Project Name:    Capstone Lanes
 * Group:           Art Anderson, Cory Brighton, Mike Gray, Daniel Okenke
 * Purpose:         Class Controller to wire the buttons to the code.
 * Help From:       http://algs4.cs.princeton.edu/13stacks/LinkedStack.java.html
 *
 * History:         04/17/2017: AEA: Create the class with fundamental attributes
 *
*/
package CapstoneLanes;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class MainControl {
    @FXML
    private Text mainMessage;

    //    @Todo build the schedule and interface with it
//    Changes main Message to Schedule
    public void ScheduleButton(ActionEvent actionEvent) {
        mainMessage.setText("Schedule");
    }

    //    @Todo build the Folio and interface with it
    //    Changes main Message to Folio
    public void FolioButton(ActionEvent actionEvent) {
        mainMessage.setText("Folio");
    }

    //    @Todo build the Search and interface with it
//    Changes main Message to Search
    public void SearchButton(ActionEvent actionEvent) {
        mainMessage.setText("Search");
    }

    //    @Todo build the Leagues and interface with it
//    Changes main Message to Leagues
    public void LeaguesButton(ActionEvent actionEvent) {
        mainMessage.setText("LeaguesButton");
    }

    //    @Todo build the Help and interface with it
//    Changes main Help to Leagues
    public void HelpButton(ActionEvent actionEvent) {
        mainMessage.setText("Help");
    }
}
