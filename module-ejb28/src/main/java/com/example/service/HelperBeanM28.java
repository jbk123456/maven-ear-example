package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM28 {

    @EJB
    private HelperBeanL28 helperBeanL28;

    public String identify() {
        return "HelperBeanM28";
    }
}
