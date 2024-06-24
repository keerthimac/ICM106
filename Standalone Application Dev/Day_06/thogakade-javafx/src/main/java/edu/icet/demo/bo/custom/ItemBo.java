package edu.icet.demo.bo.custom;

import edu.icet.demo.dto.Item;

public interface ItemBo {
    boolean saveItem(Item dto);
    boolean deleteById(String id);
}
