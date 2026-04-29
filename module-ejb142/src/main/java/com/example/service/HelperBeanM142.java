package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM142 {

    @EJB
    private HelperBeanL142 helperBeanL142;

    public String identify() {
        return "HelperBeanM142";
    }
}
