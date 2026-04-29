package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanD154 {

    @EJB
    private HelperBeanC154 helperBeanC154;

    public String identify() {
        return "HelperBeanD154";
    }
}
