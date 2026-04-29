package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL12 {

    @EJB
    private HelperBeanK12 helperBeanK12;

    public String identify() {
        return "HelperBeanL12";
    }
}
