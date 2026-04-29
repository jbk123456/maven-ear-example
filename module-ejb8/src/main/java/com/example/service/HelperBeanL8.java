package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL8 {

    @EJB
    private HelperBeanK8 helperBeanK8;

    public String identify() {
        return "HelperBeanL8";
    }
}
