package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM87 {

    @EJB
    private HelperBeanL87 helperBeanL87;

    public String identify() {
        return "HelperBeanM87";
    }
}
