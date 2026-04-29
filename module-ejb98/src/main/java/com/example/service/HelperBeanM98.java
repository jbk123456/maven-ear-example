package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM98 {

    @EJB
    private HelperBeanL98 helperBeanL98;

    public String identify() {
        return "HelperBeanM98";
    }
}
