package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanF118 {

    @EJB
    private HelperBeanE118 helperBeanE118;

    public String identify() {
        return "HelperBeanF118";
    }
}
