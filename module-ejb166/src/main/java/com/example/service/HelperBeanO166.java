package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO166 {

    @EJB
    private HelperBeanN166 helperBeanN166;

    public String identify() {
        return "HelperBeanO166";
    }
}
