package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO98 {

    @EJB
    private HelperBeanN98 helperBeanN98;

    public String identify() {
        return "HelperBeanO98";
    }
}
