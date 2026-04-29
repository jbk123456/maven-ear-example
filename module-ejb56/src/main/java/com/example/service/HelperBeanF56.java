package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF56 {

    @EJB
    private HelperBeanE56 helperBeanE56;

    public String identify() {
        return "HelperBeanF56";
    }
}
