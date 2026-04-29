package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG129 {

    @EJB
    private HelperBeanF129 helperBeanF129;

    public String identify() {
        return "HelperBeanG129";
    }
}
