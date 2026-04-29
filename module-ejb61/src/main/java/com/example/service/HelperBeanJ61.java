package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ61 {

    @EJB
    private HelperBeanI61 helperBeanI61;

    public String identify() {
        return "HelperBeanJ61";
    }
}
