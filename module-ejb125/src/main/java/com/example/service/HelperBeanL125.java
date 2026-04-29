package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL125 {

    @EJB
    private HelperBeanK125 helperBeanK125;

    public String identify() {
        return "HelperBeanL125";
    }
}
