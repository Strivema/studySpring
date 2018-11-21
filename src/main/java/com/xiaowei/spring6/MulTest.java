package com.xiaowei.spring6;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @athour Marie
 * @date 2018/11/21 8:35 PM
 **/
public class MulTest implements MultipartFile {

    public String getName() {
        return null;
    }

    public String getOriginalFilename() {
        return null;
    }

    public String getContentType() {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }

    public long getSize() {
        return 0;
    }

    public byte[] getBytes() throws IOException {
        return new byte[0];
    }

    public InputStream getInputStream() throws IOException {
        return null;
    }

    public void transferTo(File file) throws IOException, IllegalStateException {

    }
}
