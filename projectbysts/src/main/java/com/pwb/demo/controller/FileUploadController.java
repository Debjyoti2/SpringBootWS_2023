package com.pwb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pwb.demo.helper.FileUploadHelper;

@RestController
public class FileUploadController {

	@Autowired
	private FileUploadHelper fileUploadHelper;

	@RequestMapping(value = "/uploadfile", method = RequestMethod.POST)
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {

		try {

			if (file.isEmpty()) {
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("File is empty");
			} 
//			else if (!file.getContentType().equalsIgnoreCase("image/jpeg")) {
//				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Only Jpeg file allowed");
//			} 
			else {

				boolean fileuploadFlag = fileUploadHelper.fileUploaded(file);
				if (!fileuploadFlag) {
					return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Some error occurred !!");
				}

			}

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Some error occurred !!");
		}

		return ResponseEntity.status(HttpStatus.OK).body("File uploaded successfully");

	}

}
