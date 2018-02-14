/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jcombo.dao.impl;

import java.util.ArrayList;
import java.util.List;
import jcombo.app.bean.Foo;

/**
 *
 * @author RuGI
 */
public class DataComboDAOImpl implements  DataComboDAO{

    
    public List<Foo> getAll() {
        List<Foo> r = new ArrayList<Foo>();
        
        Foo f1 = new Foo();
        f1.setK("key");
        f1.setV("value");
        Foo f2 = new Foo();
        f2.setK("host");
        f2.setV("name");        
        
        r.add(f1);
        r.add(f2);
        return r;
    }

}
