package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM61 {

    @EJB
    private HelperBeanL61 helperBeanL61;

    public String identify() {
        return "HelperBeanM61";
    }
}
