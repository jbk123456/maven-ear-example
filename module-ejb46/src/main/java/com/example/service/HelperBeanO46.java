package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO46 {

    @EJB
    private HelperBeanN46 helperBeanN46;

    public String identify() {
        return "HelperBeanO46";
    }
}
