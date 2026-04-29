package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE107 {

    @EJB
    private HelperBeanD107 helperBeanD107;

    public String identify() {
        return "HelperBeanE107";
    }
}
