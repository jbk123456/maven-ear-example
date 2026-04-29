package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanJ14 {

    @EJB
    private HelperBeanI14 helperBeanI14;

    public String identify() {
        return "HelperBeanJ14";
    }
}
