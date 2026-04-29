package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG77 {

    @EJB
    private HelperBeanF77 helperBeanF77;

    public String identify() {
        return "HelperBeanG77";
    }
}
