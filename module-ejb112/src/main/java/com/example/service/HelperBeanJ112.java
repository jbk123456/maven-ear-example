package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ112 {

    @EJB
    private HelperBeanI112 helperBeanI112;

    public String identify() {
        return "HelperBeanJ112";
    }
}
