package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO159 {

    @EJB
    private HelperBeanN159 helperBeanN159;

    public String identify() {
        return "HelperBeanO159";
    }
}
