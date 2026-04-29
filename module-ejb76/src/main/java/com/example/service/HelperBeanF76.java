package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF76 {

    @EJB
    private HelperBeanE76 helperBeanE76;

    public String identify() {
        return "HelperBeanF76";
    }
}
