package pl.com.pixel.recruitment.tasks.task1.view;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import pl.com.pixel.recruitment.tasks.task1.model.Employee;
import pl.com.pixel.recruitment.tasks.task1.model.Model;

public class OutputView2 extends StackPane {

    private final Employee employee = Model.getInstance().employee;
    
    private final Label nameLabel = new Label();
    
    public OutputView2() {
        Label label = new Label("name:");
        HBox hBox = new HBox(8, label, nameLabel);
        hBox.setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
        label.setStyle("-fx-text-fill: purple;");
        getChildren().add(hBox);
    }
}