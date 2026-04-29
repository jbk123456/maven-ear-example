package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI46 {

    @EJB
    private HelperBeanH46 helperBeanH46;

    public String identify() {
        return "HelperBeanI46";
    }
}
