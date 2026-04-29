package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI132 {

    @EJB
    private HelperBeanH132 helperBeanH132;

    public String identify() {
        return "HelperBeanI132";
    }
}
