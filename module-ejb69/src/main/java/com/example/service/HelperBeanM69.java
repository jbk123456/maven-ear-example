package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM69 {

    @EJB
    private HelperBeanL69 helperBeanL69;

    public String identify() {
        return "HelperBeanM69";
    }
}
