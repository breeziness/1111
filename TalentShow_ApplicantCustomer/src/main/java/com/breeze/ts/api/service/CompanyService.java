package com.breeze.ts.api.service;

import com.breeze.ts.common.dto.CompanyDto;
import com.breeze.ts.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient("ApplicantProvider")
public interface CompanyService {
    @PostMapping("provider/company/sava.do")
    R save (@RequestBody CompanyDto companyDto);
}
