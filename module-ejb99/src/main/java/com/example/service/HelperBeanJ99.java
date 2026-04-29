package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ99 {

    @EJB
    private HelperBeanI99 helperBeanI99;

    public String identify() {
        return "HelperBeanJ99";
    }
}
