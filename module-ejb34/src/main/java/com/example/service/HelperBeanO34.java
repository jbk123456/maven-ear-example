package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO34 {

    @EJB
    private HelperBeanN34 helperBeanN34;

    public String identify() {
        return "HelperBeanO34";
    }
}
