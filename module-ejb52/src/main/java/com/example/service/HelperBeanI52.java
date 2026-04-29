package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI52 {

    @EJB
    private HelperBeanH52 helperBeanH52;

    public String identify() {
        return "HelperBeanI52";
    }
}
