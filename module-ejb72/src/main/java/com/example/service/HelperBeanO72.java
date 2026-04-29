package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO72 {

    @EJB
    private HelperBeanN72 helperBeanN72;

    public String identify() {
        return "HelperBeanO72";
    }
}
