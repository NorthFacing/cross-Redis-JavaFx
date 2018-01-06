package bob.crossRedis.domain;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KeyNode extends TreeNode<KeyNode> {

  public KeyNode(String name) {
    super(name);
  }

  @Override
  public ObservableList<KeyNode> getItems() {
    return FXCollections.emptyObservableList();
  }

  @Override
  public void createAndAddChild(String name, Object obj) {
    throw new IllegalStateException("Information has no child items");
  }

}
