package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG144 {

    @EJB
    private HelperBeanF144 helperBeanF144;

    public String identify() {
        return "HelperBeanG144";
    }
}
