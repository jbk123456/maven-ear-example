package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH166 {

    @EJB
    private HelperBeanG166 helperBeanG166;

    public String identify() {
        return "HelperBeanH166";
    }
}
