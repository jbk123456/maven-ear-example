package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ27 {

    @EJB
    private HelperBeanI27 helperBeanI27;

    public String identify() {
        return "HelperBeanJ27";
    }
}
