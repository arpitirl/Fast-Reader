package com.training.service;

import java.io.IOException;
import java.util.Dictionary;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.training.reader.Reader;
import com.training.response.SuccessResponse;
@Service
public class RegistrationService {
	public Dictionary read(MultipartFile file) throws IOException {
		Reader reader=new Reader();
		SuccessResponse response=new SuccessResponse();
		System.out.println("service");
//		System.out.println(reader.read(file));
		Dictionary transaction=reader.read(file);
		transaction.remove("");
		return transaction; 
	}

}
