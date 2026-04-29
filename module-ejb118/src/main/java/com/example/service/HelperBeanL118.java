package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL118 {

    @EJB
    private HelperBeanK118 helperBeanK118;

    public String identify() {
        return "HelperBeanL118";
    }
}
