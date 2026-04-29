package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF75 {

    @EJB
    private HelperBeanE75 helperBeanE75;

    public String identify() {
        return "HelperBeanF75";
    }
}
