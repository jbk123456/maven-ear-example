package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF41 {

    @EJB
    private HelperBeanE41 helperBeanE41;

    public String identify() {
        return "HelperBeanF41";
    }
}
