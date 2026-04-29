package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF172 {

    @EJB
    private HelperBeanE172 helperBeanE172;

    public String identify() {
        return "HelperBeanF172";
    }
}
