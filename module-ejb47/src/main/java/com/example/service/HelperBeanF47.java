package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF47 {

    @EJB
    private HelperBeanE47 helperBeanE47;

    public String identify() {
        return "HelperBeanF47";
    }
}
