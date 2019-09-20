package com.breeze.ts.provider.service.impl;


import com.breeze.ts.common.dto.AppLookDto;
import com.breeze.ts.common.util.RUtils;
import com.breeze.ts.common.vo.R;
import com.breeze.ts.entity.AppLook;
import com.breeze.ts.provider.dao.AppLookDao;
import com.breeze.ts.provider.service.AppLookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppLookServiceImpl implements AppLookService {
    @Autowired(required = false)
    AppLookDao appLookDao;
    @Override
    public R sava(AppLookDto appLookDto) {
        AppLook appLook = new AppLook();
        appLook.setAid(appLookDto.getAid());
        appLook.setLooks(appLookDto.getSees());
        int insert = appLookDao.insert(appLook);
        return insert > 0 ? RUtils.setOK("添加成功") : RUtils.setERROR("添加失败");
    }
}
