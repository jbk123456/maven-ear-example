package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH129 {

    @EJB
    private HelperBeanG129 helperBeanG129;

    public String identify() {
        return "HelperBeanH129";
    }
}
