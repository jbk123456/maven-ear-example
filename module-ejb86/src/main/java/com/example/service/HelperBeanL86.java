package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL86 {

    @EJB
    private HelperBeanK86 helperBeanK86;

    public String identify() {
        return "HelperBeanL86";
    }
}
