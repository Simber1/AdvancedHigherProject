package uk.org.kelsohighschool.ps.program.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import uk.org.kelsohighschool.ps.program.db.Co2;
import uk.org.kelsohighschool.ps.program.stuff.Sort;

public class SortTest {
	

	/**
	 * Tests sorting newest to oldest
	 */
	@Test
	public void testSortNew(){
		
		//				   id time Value        Location
		Co2 List1 = new Co2(1, 65, (float) 1.01, 2);
		Co2 List2 = new Co2(2, 12, (float) 1.02, 2);
		Co2 List3 = new Co2(3, 13, (float) 1.03, 2);
		Co2 List4 = new Co2(4, 165, (float) 1.05, 2);
		Co2 List5 = new Co2(5, 16, (float) 1.04, 2);
		Co2 List6 = new Co2(6, 19, (float) 0.5, 2);
		Co2 List7 = new Co2(7, 11, (float) 10.01, 2);
		Co2 List8 = new Co2(8, 1987, (float) 42, 2);
		Co2 List9 = new Co2(9, 167, (float) 2, 2);
		Co2 List0 = new Co2(0, 14, (float) 72, 2);
		
		ArrayList<Co2> presort = new ArrayList<Co2>();
		//System.out.println(List1);
		presort.add(List1);
		presort.add(List2);
		presort.add(List3);
		presort.add(List4);
		presort.add(List5);
		presort.add(List6);
		presort.add(List7);
		presort.add(List8);
		presort.add(List9);
		presort.add(List0);
		
		//System.out.println(list2);
		Sort sort = new Sort();
		System.out.print("Sorting new");
		
		ArrayList<Co2> sortedlist = sort.MySort(presort, "new");
		System.out.println(sortedlist);
		String stringlist = "" + sortedlist;
		assertEquals("[ Co2 [id1=8, time=1987, co2_reading=42.0, sensor_id=2],  Co2 [id1=9, time=167, co2_reading=2.0, sensor_id=2],  Co2 [id1=4, time=165, co2_reading=1.05, sensor_id=2],  Co2 [id1=1, time=65, co2_reading=1.01, sensor_id=2],  Co2 [id1=6, time=19, co2_reading=0.5, sensor_id=2],  Co2 [id1=5, time=16, co2_reading=1.04, sensor_id=2],  Co2 [id1=0, time=14, co2_reading=72.0, sensor_id=2],  Co2 [id1=3, time=13, co2_reading=1.03, sensor_id=2],  Co2 [id1=2, time=12, co2_reading=1.02, sensor_id=2],  Co2 [id1=7, time=11, co2_reading=10.01, sensor_id=2]]", stringlist);
	}

	/**
	 * Tests sorting biggest to smallest
	 */
	@Test
	public void testSortBig(){
		
		//				   id time Value        Location
		Co2 List1 = new Co2(1, 65, (float) 1.01, 2);
		Co2 List2 = new Co2(2, 12, (float) 1.02, 2);
		Co2 List3 = new Co2(3, 13, (float) 1.03, 2);
		Co2 List4 = new Co2(4, 165, (float) 1.05, 2);
		Co2 List5 = new Co2(5, 16, (float) 1.04, 2);
		Co2 List6 = new Co2(6, 19, (float) 0.5, 2);
		Co2 List7 = new Co2(7, 11, (float) 10.01, 2);
		Co2 List8 = new Co2(8, 1987, (float) 42, 2);
		Co2 List9 = new Co2(9, 167, (float) 2, 2);
		Co2 List0 = new Co2(0, 14, (float) 72, 2);
		
		ArrayList<Co2> presort = new ArrayList<Co2>();
		//System.out.println(List1);
		presort.add(List1);
		presort.add(List2);
		presort.add(List3);
		presort.add(List4);
		presort.add(List5);
		presort.add(List6);
		presort.add(List7);
		presort.add(List8);
		presort.add(List9);
		presort.add(List0);
		
		//System.out.println(list2);
		Sort sort = new Sort();
		System.out.print("Sorting big");
		
		ArrayList<Co2> sortedlist = sort.MySort(presort, "big");
		System.out.println(sortedlist);
		String stringlist = "" + sortedlist;
		assertEquals("[ Co2 [id1=0, time=14, co2_reading=72.0, sensor_id=2],  Co2 [id1=8, time=1987, co2_reading=42.0, sensor_id=2],  Co2 [id1=7, time=11, co2_reading=10.01, sensor_id=2],  Co2 [id1=9, time=167, co2_reading=2.0, sensor_id=2],  Co2 [id1=4, time=165, co2_reading=1.05, sensor_id=2],  Co2 [id1=5, time=16, co2_reading=1.04, sensor_id=2],  Co2 [id1=3, time=13, co2_reading=1.03, sensor_id=2],  Co2 [id1=2, time=12, co2_reading=1.02, sensor_id=2],  Co2 [id1=1, time=65, co2_reading=1.01, sensor_id=2],  Co2 [id1=6, time=19, co2_reading=0.5, sensor_id=2]]", stringlist);
	}
	/**
	 * Tests sorting oldest to newest
	 */
	@Test
	public void testSortOld(){
		
		//				   id time Value        Location
		Co2 List1 = new Co2(1, 65, (float) 1.01, 2);
		Co2 List2 = new Co2(2, 12, (float) 1.02, 2);
		Co2 List3 = new Co2(3, 13, (float) 1.03, 2);
		Co2 List4 = new Co2(4, 165, (float) 1.05, 2);
		Co2 List5 = new Co2(5, 16, (float) 1.04, 2);
		Co2 List6 = new Co2(6, 19, (float) 0.5, 2);
		Co2 List7 = new Co2(7, 11, (float) 10.01, 2);
		Co2 List8 = new Co2(8, 1987, (float) 42, 2);
		Co2 List9 = new Co2(9, 167, (float) 2, 2);
		Co2 List0 = new Co2(0, 14, (float) 72, 2);
		
		ArrayList<Co2> presort = new ArrayList<Co2>();
		//System.out.println(List1);
		presort.add(List1);
		presort.add(List2);
		presort.add(List3);
		presort.add(List4);
		presort.add(List5);
		presort.add(List6);
		presort.add(List7);
		presort.add(List8);
		presort.add(List9);
		presort.add(List0);
		
		//System.out.println(list2);
		Sort sort = new Sort();
		System.out.print("Sorting old");
		
		ArrayList<Co2> sortedlist = sort.MySort(presort, "old");
		System.out.println(sortedlist);
		String stringlist = "" + sortedlist;
		assertEquals("[ Co2 [id1=7, time=11, co2_reading=10.01, sensor_id=2],  Co2 [id1=2, time=12, co2_reading=1.02, sensor_id=2],  Co2 [id1=3, time=13, co2_reading=1.03, sensor_id=2],  Co2 [id1=0, time=14, co2_reading=72.0, sensor_id=2],  Co2 [id1=5, time=16, co2_reading=1.04, sensor_id=2],  Co2 [id1=6, time=19, co2_reading=0.5, sensor_id=2],  Co2 [id1=1, time=65, co2_reading=1.01, sensor_id=2],  Co2 [id1=4, time=165, co2_reading=1.05, sensor_id=2],  Co2 [id1=9, time=167, co2_reading=2.0, sensor_id=2],  Co2 [id1=8, time=1987, co2_reading=42.0, sensor_id=2]]",stringlist);
		}
	
	/**
	 * Tests sorting smallest to biggest
	 */
	@Test
	public void testSortSmall(){
		
		//				   id time Value        Location
		Co2 List1 = new Co2(1, 65, (float) 1.01, 2);
		Co2 List2 = new Co2(2, 12, (float) 1.02, 2);
		Co2 List3 = new Co2(3, 13, (float) 1.03, 2);
		Co2 List4 = new Co2(4, 165, (float) 1.05, 2);
		Co2 List5 = new Co2(5, 16, (float) 1.04, 2);
		Co2 List6 = new Co2(6, 19, (float) 0.5, 2);
		Co2 List7 = new Co2(7, 11, (float) 10.01, 2);
		Co2 List8 = new Co2(8, 1987, (float) 42, 2);
		Co2 List9 = new Co2(9, 167, (float) 2, 2);
		Co2 List0 = new Co2(0, 14, (float) 72, 2);
		
		ArrayList<Co2> presort = new ArrayList<Co2>();
		//System.out.println(List1);
		presort.add(List1);
		presort.add(List2);
		presort.add(List3);
		presort.add(List4);
		presort.add(List5);
		presort.add(List6);
		presort.add(List7);
		presort.add(List8);
		presort.add(List9);
		presort.add(List0);
		
		//System.out.println(list2);
		Sort sort = new Sort();
		System.out.print("Sorting small");
		
		ArrayList<Co2> sortedlist = sort.MySort(presort, "small");
		System.out.println(sortedlist);
		String stringlist = "" + sortedlist;
		assertEquals("[ Co2 [id1=6, time=19, co2_reading=0.5, sensor_id=2],  Co2 [id1=1, time=65, co2_reading=1.01, sensor_id=2],  Co2 [id1=2, time=12, co2_reading=1.02, sensor_id=2],  Co2 [id1=3, time=13, co2_reading=1.03, sensor_id=2],  Co2 [id1=5, time=16, co2_reading=1.04, sensor_id=2],  Co2 [id1=4, time=165, co2_reading=1.05, sensor_id=2],  Co2 [id1=9, time=167, co2_reading=2.0, sensor_id=2],  Co2 [id1=7, time=11, co2_reading=10.01, sensor_id=2],  Co2 [id1=8, time=1987, co2_reading=42.0, sensor_id=2],  Co2 [id1=0, time=14, co2_reading=72.0, sensor_id=2]]", stringlist);
	}
	
	/**
	 * Test sorting with no sort value passed, should sort oldest to newest
	 */
	@Test
	public void testSortNone(){
		
		//				   id time Value        Location
		Co2 List1 = new Co2(1, 65, (float) 1.01, 2);
		Co2 List2 = new Co2(2, 12, (float) 1.02, 2);
		Co2 List3 = new Co2(3, 13, (float) 1.03, 2);
		Co2 List4 = new Co2(4, 165, (float) 1.05, 2);
		Co2 List5 = new Co2(5, 16, (float) 1.04, 2);
		Co2 List6 = new Co2(6, 19, (float) 0.5, 2);
		Co2 List7 = new Co2(7, 11, (float) 10.01, 2);
		Co2 List8 = new Co2(8, 1987, (float) 42, 2);
		Co2 List9 = new Co2(9, 167, (float) 2, 2);
		Co2 List0 = new Co2(0, 14, (float) 72, 2);
		
		ArrayList<Co2> presort = new ArrayList<Co2>();
		//System.out.println(List1);
		presort.add(List1);
		presort.add(List2);
		presort.add(List3);
		presort.add(List4);
		presort.add(List5);
		presort.add(List6);
		presort.add(List7);
		presort.add(List8);
		presort.add(List9);
		presort.add(List0);
		
		//System.out.println(list2);
		Sort sort = new Sort();
		System.out.print("Sorting None");
		
		ArrayList<Co2> sortedlist = sort.MySort(presort, "");
		System.out.println(sortedlist);
		String stringlist = "" + sortedlist;
		assertEquals("[ Co2 [id1=7, time=11, co2_reading=10.01, sensor_id=2],  Co2 [id1=2, time=12, co2_reading=1.02, sensor_id=2],  Co2 [id1=3, time=13, co2_reading=1.03, sensor_id=2],  Co2 [id1=0, time=14, co2_reading=72.0, sensor_id=2],  Co2 [id1=5, time=16, co2_reading=1.04, sensor_id=2],  Co2 [id1=6, time=19, co2_reading=0.5, sensor_id=2],  Co2 [id1=1, time=65, co2_reading=1.01, sensor_id=2],  Co2 [id1=4, time=165, co2_reading=1.05, sensor_id=2],  Co2 [id1=9, time=167, co2_reading=2.0, sensor_id=2],  Co2 [id1=8, time=1987, co2_reading=42.0, sensor_id=2]]",stringlist);
		}
}
