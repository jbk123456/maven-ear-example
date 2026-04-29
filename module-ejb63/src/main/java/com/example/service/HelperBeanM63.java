package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM63 {

    @EJB
    private HelperBeanL63 helperBeanL63;

    public String identify() {
        return "HelperBeanM63";
    }
}
