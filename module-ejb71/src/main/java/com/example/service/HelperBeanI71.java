package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI71 {

    @EJB
    private HelperBeanH71 helperBeanH71;

    public String identify() {
        return "HelperBeanI71";
    }
}
