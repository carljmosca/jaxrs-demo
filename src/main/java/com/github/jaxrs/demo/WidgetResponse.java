/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.jaxrs.demo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author moscac
 */
public class WidgetResponse implements Serializable {
    private List<Widget> list;

    public WidgetResponse() {
        list = new ArrayList<>();
    }

    public List<Widget> getList() {
        return list;
    }

    public void setList(List<Widget> list) {
        this.list = list;
    }
    
}
