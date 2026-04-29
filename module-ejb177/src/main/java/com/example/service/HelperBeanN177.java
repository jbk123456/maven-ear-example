package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN177 {

    @EJB
    private HelperBeanM177 helperBeanM177;

    public String identify() {
        return "HelperBeanN177";
    }
}
