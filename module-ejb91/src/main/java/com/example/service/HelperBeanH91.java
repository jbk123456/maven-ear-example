package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH91 {

    @EJB
    private HelperBeanG91 helperBeanG91;

    public String identify() {
        return "HelperBeanH91";
    }
}
