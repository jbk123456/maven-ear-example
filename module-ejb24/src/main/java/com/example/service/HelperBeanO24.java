package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO24 {

    @EJB
    private HelperBeanN24 helperBeanN24;

    public String identify() {
        return "HelperBeanO24";
    }
}
