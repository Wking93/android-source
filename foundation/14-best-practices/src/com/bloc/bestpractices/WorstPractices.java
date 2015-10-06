package com.bloc.bestpractices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorstPractices extends Object {

	/************************************************
	 *	ASSIGNMENT:
	 *	Fix code and comments below this block
	/************************************************/

	public static void main(String [] args) {
		int x = 5;
		int y = 18;
		int z = 0;
		int MAGIC_NUMBER = WorstPractices.animals(false);
		MAGIC_NUMBER *= x;
		if (MAGIC_NUMBER > y) {
			while(MAGIC_NUMBER > z)  {
				MAGIC_NUMBER--;

			}
		}
	}


// animals

/*this method takes in a single parameter, yeswellheresthething. Using a very elaborate and complex algorithm, it calculate a magic number
 yeswellheresthething: a seed which helps generate the magic number
 returns: a magical number*/

	private static int animals(boolean seed)
	{
		//Start off with one of these
		
		int aInt = seed ? 34 : 21;
		float sparklesfairy = .5f;
		for (int fairy = 0; fairy < aInt; fairy++) { 
				sparklesfairy *= aInt;
		}
		 return (int) sparklesfairy * aInt;
	}

	/************************************************
	 *	ASSIGNMENT
	 *	Fix code and comments above this block
	/************************************************/
}
