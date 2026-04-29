package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO103 {

    @EJB
    private HelperBeanN103 helperBeanN103;

    public String identify() {
        return "HelperBeanO103";
    }
}
