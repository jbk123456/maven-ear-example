package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG166 {

    @EJB
    private HelperBeanF166 helperBeanF166;

    public String identify() {
        return "HelperBeanG166";
    }
}
