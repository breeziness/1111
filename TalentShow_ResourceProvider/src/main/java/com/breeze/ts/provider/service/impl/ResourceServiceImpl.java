package com.breeze.ts.provider.service.impl;

import com.breeze.ts.common.util.RUtils;
import com.breeze.ts.common.vo.R;
import com.breeze.ts.provider.core.oss.OssUtil;
import com.breeze.ts.provider.core.util.FileUtil;
import com.breeze.ts.provider.service.ResourceService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ResourceServiceImpl implements ResourceService {
    @Override
    public R<String> imageUp(MultipartFile file) throws IOException {
        String f = FileUtil.renameFile(file.getOriginalFilename());
        String u = OssUtil.sendByte("zzjava1904",f,file.getBytes());
        if (u!=null && u.length()>0){
            return RUtils.setOK("OK",u);
        }else {
            return RUtils.setERROR("上传失败");
        }
    }

    @Override
    public R<String> imageUp(MultipartFile[] files) throws IOException {
        List<String> urls = new ArrayList<>();
        for (MultipartFile file : files) {
            String f = FileUtil.renameFile(file.getOriginalFilename());
            String u = OssUtil.sendByte("zzjava1904", f,file.getBytes());
            if (u != null && u.length() > 0){
                urls.add(u);
            }
        }
        return RUtils.setOK("OK", urls);
    }
}
