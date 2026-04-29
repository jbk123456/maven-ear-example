package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO100 {

    @EJB
    private HelperBeanN100 helperBeanN100;

    public String identify() {
        return "HelperBeanO100";
    }
}
