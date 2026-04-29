package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI91 {

    @EJB
    private HelperBeanH91 helperBeanH91;

    public String identify() {
        return "HelperBeanI91";
    }
}
