package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM128 {

    @EJB
    private HelperBeanL128 helperBeanL128;

    public String identify() {
        return "HelperBeanM128";
    }
}
