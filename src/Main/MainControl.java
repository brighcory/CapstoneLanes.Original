package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class MainControl {
    @FXML private Text mainMessage;
    public void ScheduleButton(ActionEvent actionEvent) {
        mainMessage.setText("Schedule");
    }

    public void FolioButton(ActionEvent actionEvent) {
        mainMessage.setText("Folio");
    }

    public void LeaguesButton(ActionEvent actionEvent) {
        mainMessage.setText("LeaguesButton");
    }

    public void SearchButton(ActionEvent actionEvent) {
        mainMessage.setText("Search");
    }

    public void HelpButton(ActionEvent actionEvent) {
        mainMessage.setText("Help");
    }
}
