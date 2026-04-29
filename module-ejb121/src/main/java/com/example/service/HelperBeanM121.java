package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM121 {

    @EJB
    private HelperBeanL121 helperBeanL121;

    public String identify() {
        return "HelperBeanM121";
    }
}
