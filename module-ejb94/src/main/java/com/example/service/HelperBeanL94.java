package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL94 {

    @EJB
    private HelperBeanK94 helperBeanK94;

    public String identify() {
        return "HelperBeanL94";
    }
}
