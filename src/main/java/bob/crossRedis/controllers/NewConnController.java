package bob.crossRedis.controllers;

import bob.crossRedis.service.Connection;
import bob.crossRedis.service.impl.ConnectionImpl;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import java.net.URL;
import java.util.ResourceBundle;

import com.lambdaworks.redis.RedisClient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class NewConnController implements Initializable {

  @FXML
  public JFXTextField host;
  @FXML
  public JFXTextField port;
  @FXML
  public JFXPasswordField password;

  private MainController mainController;

  public void setMainController(MainController mainController) {
    this.mainController = mainController;
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
  }

  @FXML
  public void handleLoginButtonAction(ActionEvent event) {
    String hostText = host.getText();
    String portText = port.getText();
    String passwordText = password.getText();
    int portInt = 0;
    try {
      portInt = Integer.parseInt(portText);
    } catch (NumberFormatException nfe) {
      port.getStyleClass().add("wrong-credentials");
    } catch (Exception e) {
      port.getStyleClass().add("wrong-credentials");
    }

    Connection conn = new ConnectionImpl();
    RedisClient client = conn.login(hostText, portInt, passwordText);
    mainController.addTreeNode(hostText, client);

  }

  @FXML
  public void handleCancelButtonAction(ActionEvent event) {
    System.exit(0);
  }

  public static void main(String[] args) {
    String port = "ab";
    int anInt = Integer.parseInt(port);
    System.out.println(anInt);
  }

}