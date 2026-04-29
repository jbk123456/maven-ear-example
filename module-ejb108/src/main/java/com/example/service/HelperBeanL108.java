package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL108 {

    @EJB
    private HelperBeanK108 helperBeanK108;

    public String identify() {
        return "HelperBeanL108";
    }
}
