package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK106 {

    @EJB
    private HelperBeanJ106 helperBeanJ106;

    public String identify() {
        return "HelperBeanK106";
    }
}
