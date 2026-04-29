package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ109 {

    @EJB
    private HelperBeanI109 helperBeanI109;

    public String identify() {
        return "HelperBeanJ109";
    }
}
