package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM14 {

    @EJB
    private HelperBeanL14 helperBeanL14;

    public String identify() {
        return "HelperBeanM14";
    }
}
