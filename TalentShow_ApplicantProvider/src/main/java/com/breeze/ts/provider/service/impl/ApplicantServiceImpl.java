package com.breeze.ts.provider.service.impl;

import com.breeze.ts.common.dto.ApplicantDto;
import com.breeze.ts.common.util.RUtils;
import com.breeze.ts.common.vo.R;
import com.breeze.ts.entity.Applicant;
import com.breeze.ts.provider.dao.ApplicantDao;
import com.breeze.ts.provider.service.ApplicantService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: TalentShow
 * @description:
 * @author: Feri
 * @create: 2019-09-10 11:59
 */
@Service
public class ApplicantServiceImpl implements ApplicantService {
    private Logger logger=Logger.getLogger(ApplicantServiceImpl.class);
    @Autowired(required = false)
    private ApplicantDao applicantDao;
    @Override
    public R<String> save(ApplicantDto applicant) {
        Applicant app=new Applicant();
        app.setHeadurl(applicant.getImgurl());
        app.setAddress(applicant.getSite());
        app.setName(applicant.getAname());
        app.setPhone(applicant.getTel());
        app.setPosition(applicant.getDuty());
        logger.info("新增求职人信息");
        return RUtils.setR(applicantDao.insert(app)>0,"新增简历");
    }
}
