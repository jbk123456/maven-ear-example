package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL122 {

    @EJB
    private HelperBeanK122 helperBeanK122;

    public String identify() {
        return "HelperBeanL122";
    }
}
