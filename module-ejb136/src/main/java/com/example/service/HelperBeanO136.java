package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO136 {

    @EJB
    private HelperBeanN136 helperBeanN136;

    public String identify() {
        return "HelperBeanO136";
    }
}
