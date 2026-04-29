package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG177 {

    @EJB
    private HelperBeanF177 helperBeanF177;

    public String identify() {
        return "HelperBeanG177";
    }
}
