package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN103 {

    @EJB
    private HelperBeanM103 helperBeanM103;

    public String identify() {
        return "HelperBeanN103";
    }
}
