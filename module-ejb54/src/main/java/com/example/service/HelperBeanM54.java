package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM54 {

    @EJB
    private HelperBeanL54 helperBeanL54;

    public String identify() {
        return "HelperBeanM54";
    }
}
