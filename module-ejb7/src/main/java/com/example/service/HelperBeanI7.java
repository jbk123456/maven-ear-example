package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI7 {

    @EJB
    private HelperBeanH7 helperBeanH7;

    public String identify() {
        return "HelperBeanI7";
    }
}
