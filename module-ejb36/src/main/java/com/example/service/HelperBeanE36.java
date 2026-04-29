package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE36 {

    @EJB
    private HelperBeanD36 helperBeanD36;

    public String identify() {
        return "HelperBeanE36";
    }
}
