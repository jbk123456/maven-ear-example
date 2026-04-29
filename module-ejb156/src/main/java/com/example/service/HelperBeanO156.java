package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO156 {

    @EJB
    private HelperBeanN156 helperBeanN156;

    public String identify() {
        return "HelperBeanO156";
    }
}
