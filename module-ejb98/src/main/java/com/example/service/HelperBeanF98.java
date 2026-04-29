package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF98 {

    @EJB
    private HelperBeanE98 helperBeanE98;

    public String identify() {
        return "HelperBeanF98";
    }
}
