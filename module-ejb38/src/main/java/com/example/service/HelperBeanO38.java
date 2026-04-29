package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO38 {

    @EJB
    private HelperBeanN38 helperBeanN38;

    public String identify() {
        return "HelperBeanO38";
    }
}
