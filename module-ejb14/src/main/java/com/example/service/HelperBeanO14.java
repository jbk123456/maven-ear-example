package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO14 {

    @EJB
    private HelperBeanN14 helperBeanN14;

    public String identify() {
        return "HelperBeanO14";
    }
}
