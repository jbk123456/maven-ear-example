package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO158 {

    @EJB
    private HelperBeanN158 helperBeanN158;

    public String identify() {
        return "HelperBeanO158";
    }
}
