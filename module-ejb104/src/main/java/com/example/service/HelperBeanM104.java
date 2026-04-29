package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM104 {

    @EJB
    private HelperBeanL104 helperBeanL104;

    public String identify() {
        return "HelperBeanM104";
    }
}
