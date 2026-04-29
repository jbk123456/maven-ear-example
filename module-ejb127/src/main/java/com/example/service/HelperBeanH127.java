package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH127 {

    @EJB
    private HelperBeanG127 helperBeanG127;

    public String identify() {
        return "HelperBeanH127";
    }
}
