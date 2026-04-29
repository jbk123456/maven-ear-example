package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM56 {

    @EJB
    private HelperBeanL56 helperBeanL56;

    public String identify() {
        return "HelperBeanM56";
    }
}
