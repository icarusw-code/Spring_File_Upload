package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    // 업로드한 이미지 이름
    private String uploadFileName;

    // DB에 저장할 이름
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
