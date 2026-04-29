package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO143 {

    @EJB
    private HelperBeanN143 helperBeanN143;

    public String identify() {
        return "HelperBeanO143";
    }
}
