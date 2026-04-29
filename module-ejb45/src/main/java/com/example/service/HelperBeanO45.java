package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO45 {

    @EJB
    private HelperBeanN45 helperBeanN45;

    public String identify() {
        return "HelperBeanO45";
    }
}
