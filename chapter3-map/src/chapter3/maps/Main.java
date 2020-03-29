package chapter3.maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		
		Map<Student, List<Lesson>> studentLessonMap = new HashMap<Student, List<Lesson>>();
		
		studentLessonMap.put(
				
				new Student("A100", "Ahmet", "Kiraz"), 
				
				Arrays.asList(
						new Lesson("Matematik", 90),
						new Lesson("Türkçe", 70) ));
		
		
		
		studentLessonMap.put(
				
				new Student("F101", "Ali", "Yurt"), 
				
				Arrays.asList(
						new Lesson("Matematik", 90),
						new Lesson("Geometri", 70) ));
		
		
		
		studentLessonMap.put(
				new Student("B105", "Hale", "ÖzTürk"), 
				Arrays.asList(
						new Lesson("Biyoloji", 80),
						new Lesson("Türkçe", 60) ));
		
		studentLessonMap.put(
				
				new Student("D90", "Yudum", "Çiçek"),
				
				Arrays.asList(
						new Lesson("Kimya", 100),
						new Lesson("Fen", 60),
						new Lesson("Biyoloji", 50)));
		
		
		studentLessonMap.put(
				
				new Student("C90", "Yudum", "Çiçek"), 
				
				Arrays.asList(
						new Lesson("Kimya", 100)));
		
		
		showMap(studentLessonMap);
		
		
		
		
		StudentComparatorByName studentComparatorByName = new StudentComparatorByName();
		
		SortedMap<Student, List<Lesson>> sortedStudentLessonMap = 
				new TreeMap<Student, List<Lesson>>(studentComparatorByName);
		
		sortedStudentLessonMap.putAll(studentLessonMap);
		
		
		
		System.out.println("Tree map sample");
		//System.out.println(sortedStudentLessonMap);
		showMap(sortedStudentLessonMap);
		
		/*
		SortedMap<String, String> demo = new TreeMap<String, String>();
		demo.put("Pyhton", "A");
		demo.put("Java", "A");
		demo.put("C#", "A");
		demo.put("C++", "A");

		System.out.println(demo);
		*/
		
	}
	
	public static void showMap(Map<Student, List<Lesson>> studentLessonMap) {
		
		Set<Student> keys = studentLessonMap.keySet();
		
		for(Student key : keys) {
			
			System.out.println(key + " Ders Listesi");
			
		 	List<Lesson> lessonsOfStudent = studentLessonMap.get(key);
		 	
		 	for(Lesson lesson : lessonsOfStudent) {
		 		System.out.println(lesson);
		 	}
		 	System.out.println();
		}
	}

}
