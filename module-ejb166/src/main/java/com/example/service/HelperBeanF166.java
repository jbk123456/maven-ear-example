package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF166 {

    @EJB
    private HelperBeanE166 helperBeanE166;

    public String identify() {
        return "HelperBeanF166";
    }
}
