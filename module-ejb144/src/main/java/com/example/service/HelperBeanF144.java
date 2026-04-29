package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF144 {

    @EJB
    private HelperBeanE144 helperBeanE144;

    public String identify() {
        return "HelperBeanF144";
    }
}
