package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI33 {

    @EJB
    private HelperBeanH33 helperBeanH33;

    public String identify() {
        return "HelperBeanI33";
    }
}
