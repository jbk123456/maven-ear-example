package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL98 {

    @EJB
    private HelperBeanK98 helperBeanK98;

    public String identify() {
        return "HelperBeanL98";
    }
}
