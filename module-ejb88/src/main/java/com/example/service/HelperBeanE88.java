package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE88 {

    @EJB
    private HelperBeanD88 helperBeanD88;

    public String identify() {
        return "HelperBeanE88";
    }
}
