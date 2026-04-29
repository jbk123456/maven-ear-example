package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO60 {

    @EJB
    private HelperBeanN60 helperBeanN60;

    public String identify() {
        return "HelperBeanO60";
    }
}
