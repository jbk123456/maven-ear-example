package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ106 {

    @EJB
    private HelperBeanI106 helperBeanI106;

    public String identify() {
        return "HelperBeanJ106";
    }
}
