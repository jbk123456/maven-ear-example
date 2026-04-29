package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH81 {

    @EJB
    private HelperBeanG81 helperBeanG81;

    public String identify() {
        return "HelperBeanH81";
    }
}
