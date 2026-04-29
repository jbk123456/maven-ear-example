package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE166 {

    @EJB
    private HelperBeanD166 helperBeanD166;

    public String identify() {
        return "HelperBeanE166";
    }
}
