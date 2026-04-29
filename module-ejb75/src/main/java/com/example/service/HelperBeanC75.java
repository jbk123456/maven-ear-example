package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC75 {

    @EJB
    private HelperBeanB75 helperBeanB75;

    public String identify() {
        return "HelperBeanC75";
    }
}
