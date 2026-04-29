package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM125 {

    @EJB
    private HelperBeanL125 helperBeanL125;

    public String identify() {
        return "HelperBeanM125";
    }
}
