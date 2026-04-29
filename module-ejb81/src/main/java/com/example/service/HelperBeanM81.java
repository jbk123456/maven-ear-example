package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM81 {

    @EJB
    private HelperBeanL81 helperBeanL81;

    public String identify() {
        return "HelperBeanM81";
    }
}
