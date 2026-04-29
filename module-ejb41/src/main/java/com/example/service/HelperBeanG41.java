package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG41 {

    @EJB
    private HelperBeanF41 helperBeanF41;

    public String identify() {
        return "HelperBeanG41";
    }
}
