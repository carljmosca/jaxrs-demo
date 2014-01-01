/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.jaxrs.demo;

import java.io.Serializable;

/**
 *
 * @author moscac
 */
public class Widget implements Serializable {
    
    private int id;
    private String description;
    
    public Widget() {
        
    }
    
    public Widget(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
