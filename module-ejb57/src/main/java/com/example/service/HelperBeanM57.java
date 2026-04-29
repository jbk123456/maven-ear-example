package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM57 {

    @EJB
    private HelperBeanL57 helperBeanL57;

    public String identify() {
        return "HelperBeanM57";
    }
}
