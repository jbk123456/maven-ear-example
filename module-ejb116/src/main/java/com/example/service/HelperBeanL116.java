package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL116 {

    @EJB
    private HelperBeanK116 helperBeanK116;

    public String identify() {
        return "HelperBeanL116";
    }
}
