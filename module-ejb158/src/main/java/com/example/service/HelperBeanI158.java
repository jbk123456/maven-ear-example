package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI158 {

    @EJB
    private HelperBeanH158 helperBeanH158;

    public String identify() {
        return "HelperBeanI158";
    }
}
