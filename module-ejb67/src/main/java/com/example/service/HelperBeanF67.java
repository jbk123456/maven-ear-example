package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF67 {

    @EJB
    private HelperBeanE67 helperBeanE67;

    public String identify() {
        return "HelperBeanF67";
    }
}
