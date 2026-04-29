package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO141 {

    @EJB
    private HelperBeanN141 helperBeanN141;

    public String identify() {
        return "HelperBeanO141";
    }
}
