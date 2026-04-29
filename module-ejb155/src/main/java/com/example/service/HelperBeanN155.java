package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN155 {

    @EJB
    private HelperBeanM155 helperBeanM155;

    public String identify() {
        return "HelperBeanN155";
    }
}
