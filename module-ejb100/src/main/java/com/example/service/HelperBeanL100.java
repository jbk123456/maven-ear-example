package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL100 {

    @EJB
    private HelperBeanK100 helperBeanK100;

    public String identify() {
        return "HelperBeanL100";
    }
}
