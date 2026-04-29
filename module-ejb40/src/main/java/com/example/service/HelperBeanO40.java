package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO40 {

    @EJB
    private HelperBeanN40 helperBeanN40;

    public String identify() {
        return "HelperBeanO40";
    }
}
