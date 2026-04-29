package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK171 {

    @EJB
    private HelperBeanJ171 helperBeanJ171;

    public String identify() {
        return "HelperBeanK171";
    }
}
