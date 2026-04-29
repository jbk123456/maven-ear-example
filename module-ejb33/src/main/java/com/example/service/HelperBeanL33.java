package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL33 {

    @EJB
    private HelperBeanK33 helperBeanK33;

    public String identify() {
        return "HelperBeanL33";
    }
}
