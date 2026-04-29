package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI127 {

    @EJB
    private HelperBeanH127 helperBeanH127;

    public String identify() {
        return "HelperBeanI127";
    }
}
