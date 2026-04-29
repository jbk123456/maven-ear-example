package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI173 {

    @EJB
    private HelperBeanH173 helperBeanH173;

    public String identify() {
        return "HelperBeanI173";
    }
}
