package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE138 {

    @EJB
    private HelperBeanD138 helperBeanD138;

    public String identify() {
        return "HelperBeanE138";
    }
}
