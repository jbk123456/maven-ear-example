package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK14 {

    @EJB
    private HelperBeanJ14 helperBeanJ14;

    public String identify() {
        return "HelperBeanK14";
    }
}
