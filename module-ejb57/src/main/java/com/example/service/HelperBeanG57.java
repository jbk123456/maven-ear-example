package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG57 {

    @EJB
    private HelperBeanF57 helperBeanF57;

    public String identify() {
        return "HelperBeanG57";
    }
}
