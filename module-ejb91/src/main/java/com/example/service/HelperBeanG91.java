package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG91 {

    @EJB
    private HelperBeanF91 helperBeanF91;

    public String identify() {
        return "HelperBeanG91";
    }
}
