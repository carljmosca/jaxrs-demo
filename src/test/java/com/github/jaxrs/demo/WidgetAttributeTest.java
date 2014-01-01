/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.jaxrs.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author moscac
 */
public class WidgetAttributeTest {
    
    public WidgetAttributeTest() {
    }
    
    @Test
    public void testConstructor() {
        WidgetAttribute instance = new WidgetAttribute("{\"id\":100,\"description\":\"Test Description\"}");
        System.out.println(instance.getDescription());
    }
    
    @Test
    public void testMapper() {
        WidgetAttribute instance = new WidgetAttribute();
        instance.setId(100);
        instance.setDescription("Test Description");
        ObjectMapper mapper = new ObjectMapper();        
        try {
            System.out.println("instance: " + mapper.writeValueAsString(instance));
        } catch (JsonProcessingException ex) {
            fail(ex.getMessage());
        }
    }
    
}
