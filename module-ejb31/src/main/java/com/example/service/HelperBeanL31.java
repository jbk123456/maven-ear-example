package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL31 {

    @EJB
    private HelperBeanK31 helperBeanK31;

    public String identify() {
        return "HelperBeanL31";
    }
}
