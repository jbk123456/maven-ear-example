package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI165 {

    @EJB
    private HelperBeanH165 helperBeanH165;

    public String identify() {
        return "HelperBeanI165";
    }
}
