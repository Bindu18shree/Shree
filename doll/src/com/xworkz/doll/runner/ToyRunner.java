package com.xworkz.doll.runner;

import java.util.LinkedList;
import java.util.ListIterator;

import com.xworkz.doll.boot.ToyDto;

public class ToyRunner {

	public static void main(String[] args) {

		LinkedList<ToyDto> linkedlist = new LinkedList<ToyDto>();

		linkedlist.add(new ToyDto("Storio", 299.0f, 8668406421l, 3));

		linkedlist.add(new ToyDto("Galaxy Hi-tech", 389.9f, 9845366273l, 5));

		linkedlist.add(new ToyDto("Wembley", 499.0f, 8734567827l, 4));

		ListIterator<ToyDto> iterator = linkedlist.listIterator();

		while (iterator.hasNext()) {

			ToyDto value = iterator.next();

			if (value.equals(new ToyDto("Galaxy Hi-tech", 389.9f, 9845366273l, 5))) {

				iterator.add(new ToyDto("Barbie", 599.0f, 9134097827l, 6));
			} else {

				iterator.remove();
			}

		}

		for (ToyDto dto : linkedlist) {

			System.out.println(dto);
		}

	}

}
