package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM24 {

    @EJB
    private HelperBeanL24 helperBeanL24;

    public String identify() {
        return "HelperBeanM24";
    }
}
