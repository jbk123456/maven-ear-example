package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG173 {

    @EJB
    private HelperBeanF173 helperBeanF173;

    public String identify() {
        return "HelperBeanG173";
    }
}
