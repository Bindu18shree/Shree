package com.xworkz.university.runner;

import java.util.*;

import com.xworkz.university.boot.StudentDetailsDto;

public class DtoRunner {

	public static void main(String[] args) {

		List<StudentDetailsDto> dto = new ArrayList<StudentDetailsDto>();

		dto.add(new StudentDetailsDto(102, "Anusha"));
		dto.add(new StudentDetailsDto(101, "Aarohi"));
		dto.add(new StudentDetailsDto(103, "Amrutha"));
		dto.add(new StudentDetailsDto(105, "Bhabitha"));
		dto.add(new StudentDetailsDto(104, "Abhishek"));

		Collections.sort(dto);

		System.out.println(dto);

	}

}
