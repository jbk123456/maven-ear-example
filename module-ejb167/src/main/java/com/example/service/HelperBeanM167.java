package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM167 {

    @EJB
    private HelperBeanL167 helperBeanL167;

    public String identify() {
        return "HelperBeanM167";
    }
}
