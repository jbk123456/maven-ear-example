package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM84 {

    @EJB
    private HelperBeanL84 helperBeanL84;

    public String identify() {
        return "HelperBeanM84";
    }
}
