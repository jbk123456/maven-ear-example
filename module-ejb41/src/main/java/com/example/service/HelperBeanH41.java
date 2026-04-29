package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH41 {

    @EJB
    private HelperBeanG41 helperBeanG41;

    public String identify() {
        return "HelperBeanH41";
    }
}
