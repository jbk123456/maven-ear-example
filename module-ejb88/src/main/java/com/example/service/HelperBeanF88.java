package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF88 {

    @EJB
    private HelperBeanE88 helperBeanE88;

    public String identify() {
        return "HelperBeanF88";
    }
}
