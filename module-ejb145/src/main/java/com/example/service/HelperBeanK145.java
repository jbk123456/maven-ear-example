package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK145 {

    @EJB
    private HelperBeanJ145 helperBeanJ145;

    public String identify() {
        return "HelperBeanK145";
    }
}
