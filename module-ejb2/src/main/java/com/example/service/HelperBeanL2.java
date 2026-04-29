package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL2 {

    @EJB
    private HelperBeanK2 helperBeanK2;

    public String identify() {
        return "HelperBeanL2";
    }
}
