package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF165 {

    @EJB
    private HelperBeanE165 helperBeanE165;

    public String identify() {
        return "HelperBeanF165";
    }
}
