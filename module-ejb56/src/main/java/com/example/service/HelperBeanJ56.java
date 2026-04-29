package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ56 {

    @EJB
    private HelperBeanI56 helperBeanI56;

    public String identify() {
        return "HelperBeanJ56";
    }
}
