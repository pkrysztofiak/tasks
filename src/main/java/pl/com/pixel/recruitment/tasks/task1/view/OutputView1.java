package pl.com.pixel.recruitment.tasks.task1.view;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import pl.com.pixel.recruitment.tasks.task1.model.Employee;
import pl.com.pixel.recruitment.tasks.task1.model.Model;

public class OutputView1 extends HBox {

    private final Employee employee = Model.getInstance().employee;
    
    private final Label nameLabel = new Label();
    
    public OutputView1() {
        getChildren().add(new VBox(8, new Label("name="), nameLabel));
        setStyle("-fx-background-color: silver; -fx-font-size: 24px;");
    }
}