package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN48 {

    @EJB
    private HelperBeanM48 helperBeanM48;

    public String identify() {
        return "HelperBeanN48";
    }
}
