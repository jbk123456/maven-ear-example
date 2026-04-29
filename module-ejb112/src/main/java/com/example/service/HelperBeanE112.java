package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE112 {

    @EJB
    private HelperBeanD112 helperBeanD112;

    public String identify() {
        return "HelperBeanE112";
    }
}
