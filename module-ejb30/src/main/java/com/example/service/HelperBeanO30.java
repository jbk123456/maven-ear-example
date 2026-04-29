package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO30 {

    @EJB
    private HelperBeanN30 helperBeanN30;

    public String identify() {
        return "HelperBeanO30";
    }
}
