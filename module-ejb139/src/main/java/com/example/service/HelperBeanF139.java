package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF139 {

    @EJB
    private HelperBeanE139 helperBeanE139;

    public String identify() {
        return "HelperBeanF139";
    }
}
