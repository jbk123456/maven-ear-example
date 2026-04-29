package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL124 {

    @EJB
    private HelperBeanK124 helperBeanK124;

    public String identify() {
        return "HelperBeanL124";
    }
}
