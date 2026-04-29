package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO70 {

    @EJB
    private HelperBeanN70 helperBeanN70;

    public String identify() {
        return "HelperBeanO70";
    }
}
