package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField email, username, password;

    public void touchLogin(ActionEvent actionEvent) {
        Model model = new Model();
        String hashPassword = model.generatePasswordHash(password.getText());
        System.out.print(hashPassword);
    }


}
