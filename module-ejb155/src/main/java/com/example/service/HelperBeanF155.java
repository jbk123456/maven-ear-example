package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF155 {

    @EJB
    private HelperBeanE155 helperBeanE155;

    public String identify() {
        return "HelperBeanF155";
    }
}
