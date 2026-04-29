package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG88 {

    @EJB
    private HelperBeanF88 helperBeanF88;

    public String identify() {
        return "HelperBeanG88";
    }
}
