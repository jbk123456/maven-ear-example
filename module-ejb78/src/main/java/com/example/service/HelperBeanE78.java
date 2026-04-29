package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE78 {

    @EJB
    private HelperBeanD78 helperBeanD78;

    public String identify() {
        return "HelperBeanE78";
    }
}
