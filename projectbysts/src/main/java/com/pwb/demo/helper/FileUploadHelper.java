package com.pwb.demo.helper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileUploadHelper {
	
	public static final String targetpath="E:\\FileOutPut\\images";
	
	
	public boolean fileUploaded(MultipartFile file) {
		boolean isFileUploaded=false;
		
		try {
			Files.copy(file.getInputStream(), Path.of(targetpath+File.separator+file.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
			isFileUploaded=true;
		}catch (Exception e) {
			e.printStackTrace();  
		}
		
		return isFileUploaded;
	}

}
