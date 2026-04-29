package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO19 {

    @EJB
    private HelperBeanN19 helperBeanN19;

    public String identify() {
        return "HelperBeanO19";
    }
}
