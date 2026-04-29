package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM36 {

    @EJB
    private HelperBeanL36 helperBeanL36;

    public String identify() {
        return "HelperBeanM36";
    }
}
