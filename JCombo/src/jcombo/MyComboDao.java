/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcombo;

import javax.swing.JComboBox;

/**
 *
 * @author isaacruiz
 */
public class MyComboDao extends JComboBox {

    MyComboBoxModel myModel;

    public MyComboDao(MyComboBoxModel myModel) {
        // we use the constructor: JComboBox(ComboBoxModel<E> aModel)
        super(myModel);
        this.myModel = myModel;
    }

    public Object getSelectedItem() {
        return super.getSelectedItem();
    }
}
