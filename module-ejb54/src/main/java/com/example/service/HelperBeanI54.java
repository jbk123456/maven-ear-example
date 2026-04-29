package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI54 {

    @EJB
    private HelperBeanH54 helperBeanH54;

    public String identify() {
        return "HelperBeanI54";
    }
}
