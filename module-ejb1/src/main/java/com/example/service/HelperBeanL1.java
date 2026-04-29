package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL1 {

    @EJB
    private HelperBeanK1 helperBeanK1;

    public String identify() {
        return "HelperBeanL1";
    }
}
