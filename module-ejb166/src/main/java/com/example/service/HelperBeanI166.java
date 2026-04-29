package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI166 {

    @EJB
    private HelperBeanH166 helperBeanH166;

    public String identify() {
        return "HelperBeanI166";
    }
}
