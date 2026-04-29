package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF136 {

    @EJB
    private HelperBeanE136 helperBeanE136;

    public String identify() {
        return "HelperBeanF136";
    }
}
