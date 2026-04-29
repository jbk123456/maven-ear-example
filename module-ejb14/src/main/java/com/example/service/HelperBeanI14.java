package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI14 {

    @EJB
    private HelperBeanH14 helperBeanH14;

    public String identify() {
        return "HelperBeanI14";
    }
}
