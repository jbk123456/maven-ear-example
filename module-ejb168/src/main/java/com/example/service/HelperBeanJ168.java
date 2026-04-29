package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ168 {

    @EJB
    private HelperBeanI168 helperBeanI168;

    public String identify() {
        return "HelperBeanJ168";
    }
}
