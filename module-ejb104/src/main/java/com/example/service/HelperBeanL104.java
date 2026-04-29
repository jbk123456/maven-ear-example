package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL104 {

    @EJB
    private HelperBeanK104 helperBeanK104;

    public String identify() {
        return "HelperBeanL104";
    }
}
