package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL10 {

    @EJB
    private HelperBeanK10 helperBeanK10;

    public String identify() {
        return "HelperBeanL10";
    }
}
