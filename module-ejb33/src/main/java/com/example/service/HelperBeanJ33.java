package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ33 {

    @EJB
    private HelperBeanI33 helperBeanI33;

    public String identify() {
        return "HelperBeanJ33";
    }
}
