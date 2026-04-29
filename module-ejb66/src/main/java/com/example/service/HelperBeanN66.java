package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN66 {

    @EJB
    private HelperBeanM66 helperBeanM66;

    public String identify() {
        return "HelperBeanN66";
    }
}
