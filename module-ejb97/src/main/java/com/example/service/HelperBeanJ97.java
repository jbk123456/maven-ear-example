package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ97 {

    @EJB
    private HelperBeanI97 helperBeanI97;

    public String identify() {
        return "HelperBeanJ97";
    }
}
