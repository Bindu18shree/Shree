package com.xworkz.university.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.university.boot.StudentDetailsDto;
import com.xworkz.university.boot.University;

public class UniversityRunner {

	public static void main(String[] args) {

		Comparator<University> comparator = new Comparator<University>() {

			@Override
			public int compare(University u1, University u2) {

				if (u1.getUniversityName().endsWith("University") && u2.getUniversityName().endsWith("University")) {

					return u1.getUniversityName().compareTo(u2.getUniversityName());
				} else if (u1.getUniversityName().endsWith("University")) {

					return -1;

				}

				else if (u2.getUniversityName().endsWith("University")) {

					return 1;
				} else {

					return u1.getUniversityName().compareTo(u2.getUniversityName());
				}

			}
		};

		List<University> list = new ArrayList<University>();

		list.add(new University("Ramaiah University", 560073));
		list.add(new University("Christ University", 560078));
		list.add(new University("RNS Institution", 567803));
		list.add(new University("PES University", 562109));
		list.add(new University("Ramaiah Institute of Technology", 562003));

		Collections.sort(list, comparator);

		System.out.println(list);

	}

}
