package com.first;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.first.Dao.StudentDao;

@SpringBootApplication
public class BootWithPostGreApplication implements CommandLineRunner{

	@Autowired
	private StudentDao sdao;
	
	public static void main(String[] args) {
		SpringApplication.run(BootWithPostGreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//this.sdao.createTable();
		this.sdao.insertDatat("chandan jat", "Indore");
		
	}
	
	/*
	 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 * String name = br.readLine();
	 */
	

}
