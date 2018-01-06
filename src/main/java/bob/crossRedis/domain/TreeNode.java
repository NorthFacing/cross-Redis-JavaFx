package bob.crossRedis.domain;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public abstract class TreeNode<T extends TreeNode<?>> {

  private final StringProperty name = new SimpleStringProperty();
  private final ObservableList<T> items = FXCollections.observableArrayList();

  public TreeNode(String name) {
    setName(name);
  }

  public String getName() {
    return name.get();
  }

  public StringProperty nameProperty() {
    return name;
  }

  public void setName(String name) {
    this.name.set(name);
  }

  public ObservableList<T> getItems() {
    return items;
  }

  public abstract void createAndAddChild(String name,Object obj);

}
