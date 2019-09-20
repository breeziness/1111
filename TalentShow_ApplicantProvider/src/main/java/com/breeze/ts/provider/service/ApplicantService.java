package com.breeze.ts.provider.service;


import com.breeze.ts.common.dto.ApplicantDto;
import com.breeze.ts.common.vo.R;

public interface ApplicantService {
    R<String> save(ApplicantDto applicant);

}
