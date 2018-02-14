/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcombo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import jcombo.app.bean.Foo;

/**
 *
 * @author RuGI
 */
public class MyComboBoxModel extends AbstractListModel implements ComboBoxModel {

    private List<Foo> r = null;
    private Foo selected = null;

    public MyComboBoxModel(List<Foo> r ) {
        super();
        this.r = r;
    }

    @Override
    public int getSize() {
        return this.r.size();
    }

    @Override
    public Object getElementAt(int index) {
        return this.r.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.selected = (Foo)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return  this.selected;
    }


}
