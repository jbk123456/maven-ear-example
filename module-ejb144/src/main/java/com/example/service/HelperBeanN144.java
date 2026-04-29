package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN144 {

    @EJB
    private HelperBeanM144 helperBeanM144;

    public String identify() {
        return "HelperBeanN144";
    }
}
