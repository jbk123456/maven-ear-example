package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ103 {

    @EJB
    private HelperBeanI103 helperBeanI103;

    public String identify() {
        return "HelperBeanJ103";
    }
}
