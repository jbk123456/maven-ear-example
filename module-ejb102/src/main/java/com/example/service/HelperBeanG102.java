package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG102 {

    @EJB
    private HelperBeanF102 helperBeanF102;

    public String identify() {
        return "HelperBeanG102";
    }
}
