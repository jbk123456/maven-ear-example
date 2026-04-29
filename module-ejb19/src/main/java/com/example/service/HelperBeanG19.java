package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG19 {

    @EJB
    private HelperBeanF19 helperBeanF19;

    public String identify() {
        return "HelperBeanG19";
    }
}
