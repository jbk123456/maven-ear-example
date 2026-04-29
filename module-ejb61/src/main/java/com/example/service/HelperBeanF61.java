package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF61 {

    @EJB
    private HelperBeanE61 helperBeanE61;

    public String identify() {
        return "HelperBeanF61";
    }
}
