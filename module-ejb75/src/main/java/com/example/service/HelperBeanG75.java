package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG75 {

    @EJB
    private HelperBeanF75 helperBeanF75;

    public String identify() {
        return "HelperBeanG75";
    }
}
