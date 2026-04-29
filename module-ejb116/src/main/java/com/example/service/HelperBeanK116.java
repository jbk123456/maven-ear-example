package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanK116 {

    @EJB
    private HelperBeanJ116 helperBeanJ116;

    public String identify() {
        return "HelperBeanK116";
    }
}
