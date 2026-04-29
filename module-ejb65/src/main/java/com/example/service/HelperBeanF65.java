package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF65 {

    @EJB
    private HelperBeanE65 helperBeanE65;

    public String identify() {
        return "HelperBeanF65";
    }
}
