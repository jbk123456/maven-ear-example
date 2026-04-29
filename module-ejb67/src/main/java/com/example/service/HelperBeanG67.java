package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG67 {

    @EJB
    private HelperBeanF67 helperBeanF67;

    public String identify() {
        return "HelperBeanG67";
    }
}
