package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN97 {

    @EJB
    private HelperBeanM97 helperBeanM97;

    public String identify() {
        return "HelperBeanN97";
    }
}
