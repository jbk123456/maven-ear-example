package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF177 {

    @EJB
    private HelperBeanE177 helperBeanE177;

    public String identify() {
        return "HelperBeanF177";
    }
}
