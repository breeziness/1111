package com.breeze.ts.provider.service.impl;

import com.breeze.ts.common.dto.CompanyDto;
import com.breeze.ts.common.util.RUtils;
import com.breeze.ts.common.vo.R;
import com.breeze.ts.entity.Company;
import com.breeze.ts.provider.dao.CompanyDao;
import com.breeze.ts.provider.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired(required = false)
    CompanyDao companyDao;
    @Override
    public R sava(CompanyDto companyDto) {
        Company company = new Company();
        company.setAid(companyDto.getAid());
        company.setDuty(companyDto.getDuty());
        company.setEndTime(companyDto.getEndTime());
        company.setName(companyDto.getName());
        company.setSalary(companyDto.getSalary());
        company.setStartTime(companyDto.getStartTime());
        company.setWorkcontent(companyDto.getWorkcontent());
        int insert = companyDao.insert(company);
        return insert > 0 ? RUtils.setOK("添加成功"):RUtils.setERROR("添加失败");
    }
}
