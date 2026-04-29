package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ100 {

    @EJB
    private HelperBeanI100 helperBeanI100;

    public String identify() {
        return "HelperBeanJ100";
    }
}
