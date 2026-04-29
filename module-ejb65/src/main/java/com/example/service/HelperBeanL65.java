package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL65 {

    @EJB
    private HelperBeanK65 helperBeanK65;

    public String identify() {
        return "HelperBeanL65";
    }
}
