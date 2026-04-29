package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM136 {

    @EJB
    private HelperBeanL136 helperBeanL136;

    public String identify() {
        return "HelperBeanM136";
    }
}
