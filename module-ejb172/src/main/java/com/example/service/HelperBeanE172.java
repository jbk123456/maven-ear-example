package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE172 {

    @EJB
    private HelperBeanD172 helperBeanD172;

    public String identify() {
        return "HelperBeanE172";
    }
}
