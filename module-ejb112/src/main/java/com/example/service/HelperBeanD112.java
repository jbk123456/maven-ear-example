package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD112 {

    @EJB
    private HelperBeanC112 helperBeanC112;

    public String identify() {
        return "HelperBeanD112";
    }
}
