package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL14 {

    @EJB
    private HelperBeanK14 helperBeanK14;

    public String identify() {
        return "HelperBeanL14";
    }
}
