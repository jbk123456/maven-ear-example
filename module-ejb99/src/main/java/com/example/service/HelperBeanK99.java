package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK99 {

    @EJB
    private HelperBeanJ99 helperBeanJ99;

    public String identify() {
        return "HelperBeanK99";
    }
}
