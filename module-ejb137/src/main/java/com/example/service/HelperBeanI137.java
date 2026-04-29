package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI137 {

    @EJB
    private HelperBeanH137 helperBeanH137;

    public String identify() {
        return "HelperBeanI137";
    }
}
