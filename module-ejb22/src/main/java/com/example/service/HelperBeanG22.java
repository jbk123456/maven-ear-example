package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG22 {

    @EJB
    private HelperBeanF22 helperBeanF22;

    public String identify() {
        return "HelperBeanG22";
    }
}
