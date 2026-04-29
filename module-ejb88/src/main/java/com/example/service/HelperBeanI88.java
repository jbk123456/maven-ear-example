package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI88 {

    @EJB
    private HelperBeanH88 helperBeanH88;

    public String identify() {
        return "HelperBeanI88";
    }
}
