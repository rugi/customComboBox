/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcombo.app.bean;

/**
 *
 * @author RuGI
 */
public class Foo {

    private String k;
    private String v;

    public Foo() {
        super();
    }

    /**
     * @return the k
     */
    public String getK() {
        return k;
    }

    /**
     * @param k the k to set
     */
    public void setK(String k) {
        this.k = k;
    }

    /**
     * @return the v
     */
    public String getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(String v) {
        this.v = v;
    }
    public String toString(){
        return this.k;
    }

}
