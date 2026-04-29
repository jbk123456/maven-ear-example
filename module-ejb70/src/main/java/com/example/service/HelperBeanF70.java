package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF70 {

    @EJB
    private HelperBeanE70 helperBeanE70;

    public String identify() {
        return "HelperBeanF70";
    }
}
