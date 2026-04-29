package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH132 {

    @EJB
    private HelperBeanG132 helperBeanG132;

    public String identify() {
        return "HelperBeanH132";
    }
}
