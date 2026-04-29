package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM93 {

    @EJB
    private HelperBeanL93 helperBeanL93;

    public String identify() {
        return "HelperBeanM93";
    }
}
