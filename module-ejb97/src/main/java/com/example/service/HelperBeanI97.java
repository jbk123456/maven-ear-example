package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI97 {

    @EJB
    private HelperBeanH97 helperBeanH97;

    public String identify() {
        return "HelperBeanI97";
    }
}
