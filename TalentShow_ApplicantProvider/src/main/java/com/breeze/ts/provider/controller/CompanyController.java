package com.breeze.ts.provider.controller;

import com.breeze.ts.common.dto.CompanyDto;
import com.breeze.ts.common.vo.R;
import com.breeze.ts.provider.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;
    @PostMapping("/provider/company/sava.do")
    public R sava(@RequestBody CompanyDto companyDto){
        return  companyService.sava(companyDto);
    }
}
