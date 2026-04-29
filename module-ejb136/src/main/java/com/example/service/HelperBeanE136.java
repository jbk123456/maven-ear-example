package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE136 {

    @EJB
    private HelperBeanD136 helperBeanD136;

    public String identify() {
        return "HelperBeanE136";
    }
}
