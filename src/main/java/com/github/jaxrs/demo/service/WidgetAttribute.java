/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.jaxrs.demo.service;

/**
 *
 * @author moscac
 */
public class WidgetAttribute {
    
    private int id;
    private String description;
    
    public WidgetAttribute() {
        
    }
    
    // remove this constructor to see what happens if the Jersey requirement
    // for collection type parameters is not met 
    public WidgetAttribute(String description) {
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
