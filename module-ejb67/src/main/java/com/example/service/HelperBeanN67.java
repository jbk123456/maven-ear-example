package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN67 {

    @EJB
    private HelperBeanM67 helperBeanM67;

    public String identify() {
        return "HelperBeanN67";
    }
}
