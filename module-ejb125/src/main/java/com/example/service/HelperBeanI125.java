package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI125 {

    @EJB
    private HelperBeanH125 helperBeanH125;

    public String identify() {
        return "HelperBeanI125";
    }
}
