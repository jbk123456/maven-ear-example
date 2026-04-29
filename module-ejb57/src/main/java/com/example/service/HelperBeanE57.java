package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanE57 {

    @EJB
    private HelperBeanD57 helperBeanD57;

    public String identify() {
        return "HelperBeanE57";
    }
}
