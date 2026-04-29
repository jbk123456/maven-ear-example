package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF54 {

    @EJB
    private HelperBeanE54 helperBeanE54;

    public String identify() {
        return "HelperBeanF54";
    }
}
