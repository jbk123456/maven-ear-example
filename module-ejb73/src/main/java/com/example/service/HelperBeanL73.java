package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL73 {

    @EJB
    private HelperBeanK73 helperBeanK73;

    public String identify() {
        return "HelperBeanL73";
    }
}
