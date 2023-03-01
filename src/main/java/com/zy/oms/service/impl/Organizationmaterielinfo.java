package com.zy.oms.service.impl;

import com.zy.oms.repository.IOrganizationmaterielinfoRepository;
import com.zy.oms.service.IOrganizationmaterielinfo;
import org.springframework.stereotype.Service;

@Service
public class Organizationmaterielinfo implements IOrganizationmaterielinfo {
    private final IOrganizationmaterielinfoRepository organizationmaterielinfoRepository;

    public Organizationmaterielinfo(IOrganizationmaterielinfoRepository organizationmaterielinfoRepository) {
        this.organizationmaterielinfoRepository = organizationmaterielinfoRepository;
    }
}
