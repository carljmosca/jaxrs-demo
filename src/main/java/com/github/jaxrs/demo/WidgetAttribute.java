/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.jaxrs.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author moscac
 */
@XmlRootElement(name = "widgetAttribute")
@XmlAccessorType(XmlAccessType.FIELD)
public class WidgetAttribute implements Serializable {

    @XmlAttribute
    private int id;
    @XmlAttribute
    private String description;

    public WidgetAttribute() {

    }

    // remove this constructor to see what happens if the Jersey requirement
    // for collection type parameters is not met 
    public WidgetAttribute(String value) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            WidgetAttribute instance = mapper.readValue(value, WidgetAttribute.class);
            this.id = instance.getId();
            this.description = instance.getDescription();
        } catch (IOException ex) {
            Logger.getLogger(WidgetAttribute.class.getName()).log(Level.SEVERE, null, ex);
        }
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
