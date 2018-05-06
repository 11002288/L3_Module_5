package data_structures;

import java.util.ArrayList;

/**
 * Copyright The League of Amazing Programmers 2013-2017 Level 3 Two ArrayList
 * Cleaning Exercises Duration=.00 Platform=Eclipse Type=Recipe Objectives=
 */

public class RemovingStuffFromArrayLists {

	public static void main(String[] args) {

		class Stuff {
		}
		class Worm extends Stuff {
		}
		class Dirt extends Stuff {
		}
		ArrayList<Stuff> yard = new ArrayList<Stuff>();
		yard.add(new Dirt());
		yard.add(new Worm());
		yard.add(new Dirt());
		yard.add(new Dirt());
		yard.add(new Worm());
		yard.add(new Dirt());

		/* TODO 1: Clean out the dirt but keep the delicious worms. */
		for (int i = yard.size() - 1; i >= 0;i--) {
			if (yard.get(i) instanceof Dirt) {
				yard.remove(i);
			}
			
		}
		System.out.println(yard.size());
		// System.out.println(yard.size()); // should be 2

		ArrayList<Character> truth = new ArrayList<Character>();
		truth.add('#');
		truth.add('#');
		truth.add('s');
		truth.add('u');
		truth.add('#');
		truth.add('n');
		truth.add('s');
		truth.add(' ');
		truth.add('#');
		truth.add('o');
		truth.add('u');
		truth.add('#');
		truth.add('t');
		truth.add('#');
		truth.add(' ');
		truth.add('g');
		truth.add('#');
		truth.add('u');
		truth.add('n');
		truth.add('s');
		truth.add('#');
		truth.add(' ');
		truth.add('o');
		truth.add('#');
		truth.add('u');
		truth.add('t');

		/* TODO 2: Remove the hash symbols and print out the truth. */
		for (int i = 0; i < truth.size(); i++) {
			if (truth.get(i) == '#') {
				truth.remove(i);
				i--;
			}
			
		}
		System.out.println(truth);
	}
}
