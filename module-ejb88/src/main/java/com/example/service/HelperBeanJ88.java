package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ88 {

    @EJB
    private HelperBeanI88 helperBeanI88;

    public String identify() {
        return "HelperBeanJ88";
    }
}
