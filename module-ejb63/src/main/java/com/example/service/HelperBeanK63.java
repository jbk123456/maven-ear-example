package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK63 {

    @EJB
    private HelperBeanJ63 helperBeanJ63;

    public String identify() {
        return "HelperBeanK63";
    }
}
