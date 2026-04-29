package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD138 {

    @EJB
    private HelperBeanC138 helperBeanC138;

    public String identify() {
        return "HelperBeanD138";
    }
}
