package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF99 {

    @EJB
    private HelperBeanE99 helperBeanE99;

    public String identify() {
        return "HelperBeanF99";
    }
}
