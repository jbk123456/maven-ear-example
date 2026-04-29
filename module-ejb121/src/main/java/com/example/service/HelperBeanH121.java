package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH121 {

    @EJB
    private HelperBeanG121 helperBeanG121;

    public String identify() {
        return "HelperBeanH121";
    }
}
