package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI31 {

    @EJB
    private HelperBeanH31 helperBeanH31;

    public String identify() {
        return "HelperBeanI31";
    }
}
