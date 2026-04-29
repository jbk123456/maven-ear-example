package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK112 {

    @EJB
    private HelperBeanJ112 helperBeanJ112;

    public String identify() {
        return "HelperBeanK112";
    }
}
