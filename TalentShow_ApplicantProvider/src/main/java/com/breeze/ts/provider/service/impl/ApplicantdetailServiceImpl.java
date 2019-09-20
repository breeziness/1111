package com.breeze.ts.provider.service.impl;

import com.breeze.ts.common.dto.ApplicantdetailDto;
import com.breeze.ts.common.util.RUtils;
import com.breeze.ts.common.vo.R;
import com.breeze.ts.entity.ApplicantDetail;
import com.breeze.ts.provider.dao.ApplicantdetailDao;
import com.breeze.ts.provider.service.ApplicantdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicantdetailServiceImpl implements ApplicantdetailService {

    @Autowired(required = false)
    ApplicantdetailDao applicantdetailDao;
    @Override
    public R sava(ApplicantdetailDto applicantdetailDto) {
        ApplicantDetail applicantdetail = new ApplicantDetail();
        applicantdetail.setAid(applicantdetail.getAid());
        applicantdetail.setBirthday(applicantdetail.getBirthday());
        applicantdetail.setEducation(applicantdetailDto.getEducation());
        applicantdetail.setSelfinfo(applicantdetailDto.getSelfinfo());
        applicantdetail.setSelfpower(applicantdetailDto.getSelfpower());
        applicantdetail.setEducation(applicantdetailDto.getEducation());
        applicantdetail.setWorkyear(applicantdetailDto.getWorkyear());
        return applicantdetailDao.insert(applicantdetail) > 0 ? RUtils.setOK("添加成功") : RUtils.setERROR("添加失败");
    }
}
