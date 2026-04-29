package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG98 {

    @EJB
    private HelperBeanF98 helperBeanF98;

    public String identify() {
        return "HelperBeanG98";
    }
}
