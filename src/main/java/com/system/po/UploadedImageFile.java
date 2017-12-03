package com.system.po;

import org.springframework.web.multipart.MultipartFile;

/**
 * 项目名称：7ThHospInfoMaintSystem
 * 类名称：UploadedImageFile
 * 类描述：图片上传
 * 创建人：lxk
 * 创建时间：2017-12-01 19:24
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
public class UploadedImageFile {

    MultipartFile photo;

    public MultipartFile getPhoto() {
        return photo;
    }

    public void setPhoto(MultipartFile photo) {
        this.photo = photo;
    }
}
