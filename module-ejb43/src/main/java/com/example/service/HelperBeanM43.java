package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM43 {

    @EJB
    private HelperBeanL43 helperBeanL43;

    public String identify() {
        return "HelperBeanM43";
    }
}
