package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH113 {

    @EJB
    private HelperBeanG113 helperBeanG113;

    public String identify() {
        return "HelperBeanH113";
    }
}
