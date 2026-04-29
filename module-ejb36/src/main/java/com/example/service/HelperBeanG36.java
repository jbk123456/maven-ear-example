package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG36 {

    @EJB
    private HelperBeanF36 helperBeanF36;

    public String identify() {
        return "HelperBeanG36";
    }
}
