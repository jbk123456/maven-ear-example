package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF78 {

    @EJB
    private HelperBeanE78 helperBeanE78;

    public String identify() {
        return "HelperBeanF78";
    }
}
