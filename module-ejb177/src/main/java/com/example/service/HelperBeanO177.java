package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO177 {

    @EJB
    private HelperBeanN177 helperBeanN177;

    public String identify() {
        return "HelperBeanO177";
    }
}
