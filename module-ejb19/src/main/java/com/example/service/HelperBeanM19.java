package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM19 {

    @EJB
    private HelperBeanL19 helperBeanL19;

    public String identify() {
        return "HelperBeanM19";
    }
}
