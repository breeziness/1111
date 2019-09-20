package com.breeze.ts.api.api;

import com.breeze.ts.api.service.CompanyService;
import com.breeze.ts.common.dto.CompanyDto;
import com.breeze.ts.common.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;
    @PostMapping("api/company/save.do")
    public R save(@RequestBody CompanyDto companyDto){
        return companyService.save(companyDto);
    }
}
