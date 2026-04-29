package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE171 {

    @EJB
    private HelperBeanD171 helperBeanD171;

    public String identify() {
        return "HelperBeanE171";
    }
}
