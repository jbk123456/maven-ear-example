package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH167 {

    @EJB
    private HelperBeanG167 helperBeanG167;

    public String identify() {
        return "HelperBeanH167";
    }
}
