package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ144 {

    @EJB
    private HelperBeanI144 helperBeanI144;

    public String identify() {
        return "HelperBeanJ144";
    }
}
