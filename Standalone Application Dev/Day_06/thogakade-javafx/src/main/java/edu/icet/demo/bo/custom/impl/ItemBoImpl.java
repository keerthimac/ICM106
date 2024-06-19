package edu.icet.demo.bo.custom.impl;

import edu.icet.demo.bo.custom.ItemBo;
import edu.icet.demo.model.Item;

public class ItemBoImpl implements ItemBo {
    @Override
    public boolean saveItem(Item dto) {
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }
}
