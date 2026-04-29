package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL63 {

    @EJB
    private HelperBeanK63 helperBeanK63;

    public String identify() {
        return "HelperBeanL63";
    }
}
