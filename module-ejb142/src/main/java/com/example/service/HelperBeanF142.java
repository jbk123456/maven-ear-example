package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF142 {

    @EJB
    private HelperBeanE142 helperBeanE142;

    public String identify() {
        return "HelperBeanF142";
    }
}
