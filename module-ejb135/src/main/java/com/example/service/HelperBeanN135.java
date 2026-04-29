package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN135 {

    @EJB
    private HelperBeanM135 helperBeanM135;

    public String identify() {
        return "HelperBeanN135";
    }
}
