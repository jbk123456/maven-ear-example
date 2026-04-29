package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM144 {

    @EJB
    private HelperBeanL144 helperBeanL144;

    public String identify() {
        return "HelperBeanM144";
    }
}
