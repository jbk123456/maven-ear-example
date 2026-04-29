package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM94 {

    @EJB
    private HelperBeanL94 helperBeanL94;

    public String identify() {
        return "HelperBeanM94";
    }
}
