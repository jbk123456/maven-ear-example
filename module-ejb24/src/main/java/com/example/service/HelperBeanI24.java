package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI24 {

    @EJB
    private HelperBeanH24 helperBeanH24;

    public String identify() {
        return "HelperBeanI24";
    }
}
