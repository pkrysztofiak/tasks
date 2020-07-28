package pl.com.pixel.recruitment.tasks.task1.view;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import pl.com.pixel.recruitment.tasks.task1.model.Employee;
import pl.com.pixel.recruitment.tasks.task1.model.Model;

public class InputView extends StackPane {

    private final TextField nameTextField = new TextField();
    private final Button submitButton = new Button("Submit");
    
    private final Employee employee = Model.getInstance().employee;
    
    public InputView() {
        getChildren().add(new HBox(nameTextField, submitButton));
        
        nameTextField.addEventHandler(KeyEvent.KEY_PRESSED, event -> {
            if (KeyCode.ENTER.equals(event.getCode())) {
                employee.setName(nameTextField.getText());
            }
        });
        
        submitButton.setOnMouseClicked(event -> {
            employee.setName(nameTextField.getText());
        });
    }
}