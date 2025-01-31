package duke.gui;

import duke.Duke;
import duke.util.Ui;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * Controller for MainWindow. Provides the layout for the other controls.
 */
public class MainWindow extends AnchorPane {
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private VBox dialogContainer;
    @FXML
    private TextField userInput;
    @FXML
    private Button sendButton;

    private Duke duke;

    private Image userImage = new Image(this.getClass().getResourceAsStream("/images/DaUser.png"));
    private Image dukeImage = new Image(this.getClass().getResourceAsStream("/images/DaDuke.png"));

    /**
     * Initializes the main window with default UI settings and behaviors.
     */
    @FXML
    public void initialize() {
        scrollPane.vvalueProperty().bind(dialogContainer.heightProperty());
        dialogContainer.getChildren().addAll(DialogBox.getDukeDialog(Ui.showWelcomeMessage(), dukeImage));
    }

    public void setDuke(Duke d) {
        duke = d;
    }

    /**
     * Creates two dialog boxes, one echoing user input and the other containing Duke's reply and then appends them to
     * the dialog container. Clears the user input after processing.
     */
    @FXML
    private void handleUserInput() {
        String input = userInput.getText();
        String response = duke.getResponse(input);
        dialogContainer.getChildren().addAll(
                DialogBox.getUserDialog(input, userImage),
                DialogBox.getDukeDialog(response, dukeImage)
        );
        userInput.clear();
    }

    /**
     * Handles the style of the send button when the mouse hovers over it.
     * Changes the background color and cursor style for improved user feedback.
     */
    @FXML
    public void onHoverButton() {
        sendButton.setStyle("-fx-background-color: #005792; -fx-text-fill: #fff; "
                + "-fx-background-radius: 20; -fx-border-radius: 20; -fx-cursor: hand;");
    }

    /**
     * Reverts the style of the send button when the mouse exits the button area.
     * Resets the background color and maintains the cursor style for a consistent user experience.
     */
    @FXML
    public void onExitButton() {
        sendButton.setStyle("-fx-background-color: #0077B5; -fx-text-fill: #fff; "
                + "-fx-background-radius: 20; -fx-border-radius: 20; -fx-cursor: hand;");
    }

}

