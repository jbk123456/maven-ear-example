package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH57 {

    @EJB
    private HelperBeanG57 helperBeanG57;

    public String identify() {
        return "HelperBeanH57";
    }
}
