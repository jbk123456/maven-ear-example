package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN82 {

    @EJB
    private HelperBeanM82 helperBeanM82;

    public String identify() {
        return "HelperBeanN82";
    }
}
