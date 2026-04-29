package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM141 {

    @EJB
    private HelperBeanL141 helperBeanL141;

    public String identify() {
        return "HelperBeanM141";
    }
}
