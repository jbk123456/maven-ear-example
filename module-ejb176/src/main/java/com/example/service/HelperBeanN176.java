package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN176 {

    @EJB
    private HelperBeanM176 helperBeanM176;

    public String identify() {
        return "HelperBeanN176";
    }
}
