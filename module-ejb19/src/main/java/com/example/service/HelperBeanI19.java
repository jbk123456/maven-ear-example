package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI19 {

    @EJB
    private HelperBeanH19 helperBeanH19;

    public String identify() {
        return "HelperBeanI19";
    }
}
