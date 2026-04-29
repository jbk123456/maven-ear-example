package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI100 {

    @EJB
    private HelperBeanH100 helperBeanH100;

    public String identify() {
        return "HelperBeanI100";
    }
}
