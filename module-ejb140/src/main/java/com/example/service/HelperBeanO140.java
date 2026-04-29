package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO140 {

    @EJB
    private HelperBeanN140 helperBeanN140;

    public String identify() {
        return "HelperBeanO140";
    }
}
