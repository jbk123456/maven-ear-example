package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO171 {

    @EJB
    private HelperBeanN171 helperBeanN171;

    public String identify() {
        return "HelperBeanO171";
    }
}
