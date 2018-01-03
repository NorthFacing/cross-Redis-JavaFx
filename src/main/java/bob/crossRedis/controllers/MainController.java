package bob.crossRedis.controllers;

import bob.crossRedis.domain.ConnNode;
import com.jfoenix.controls.JFXTreeView;
import com.lambdaworks.redis.RedisClient;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TreeItem;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainController implements Initializable {

  @FXML
  public StackPane root;
  @FXML
  public SplitPane centrePane;
  @FXML
  public JFXTreeView treeNodes;

  private Stage newConnStage;

  @FXML
  public void addConn() {
    newConnStage.show();
  }

  public void addTreeNode(String titile, RedisClient client) {
    TreeItem<ConnNode> root = treeNodes.getRoot();
//    addNode(root, new ConnNode(titile, client));
  }


  @Override
  public void initialize(URL location, ResourceBundle resources) {
    // resize dividerPosition when zooming the window
    centrePane.widthProperty().addListener((observableVal, oldVal, newVale) -> centrePane.setDividerPositions(0.2, 0.8));
    // connection nodes
    treeNodes.setShowRoot(false);
    TreeItem<String> root = new TreeItem<>();
    root.setExpanded(true);
    treeNodes.setRoot(root);

    // load new connection stage
    loadAddConnStage();
  }

  private TreeItem<ConnNode> addNode(TreeItem<ConnNode> parent, ConnNode conn) {
    TreeItem<ConnNode> treeItem = new TreeItem<>(conn);
    treeItem.setExpanded(true);
    parent.getChildren().add(treeItem);
    return treeItem;
  }

  private void loadAddConnStage() {
    try {
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/jfx_fxml/connection.fxml"));
      Parent addConnScene = fxmlLoader.load();
      newConnStage = new Stage(StageStyle.DECORATED);
      newConnStage.setTitle("new connection");
      newConnStage.setScene(new Scene(addConnScene));
      // linked with mainController
      NewConnController newConnController = fxmlLoader.getController();
      newConnController.setMainController(this);
    } catch (IOException ex) {
      Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
    }
  }


}
