package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK72 {

    @EJB
    private HelperBeanJ72 helperBeanJ72;

    public String identify() {
        return "HelperBeanK72";
    }
}
