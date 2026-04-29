package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB57 {

    @EJB
    private HelperBeanA57 helperBeanA57;

    public String identify() {
        return "HelperBeanB57";
    }
}
