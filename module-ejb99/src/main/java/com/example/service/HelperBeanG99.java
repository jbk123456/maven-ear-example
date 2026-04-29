package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG99 {

    @EJB
    private HelperBeanF99 helperBeanF99;

    public String identify() {
        return "HelperBeanG99";
    }
}
