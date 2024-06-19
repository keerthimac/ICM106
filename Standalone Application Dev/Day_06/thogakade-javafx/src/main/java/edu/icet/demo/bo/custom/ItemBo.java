package edu.icet.demo.bo.custom;

import edu.icet.demo.model.Item;

public interface ItemBo {
    boolean saveItem(Item dto);
    boolean deleteById(String id);
}
