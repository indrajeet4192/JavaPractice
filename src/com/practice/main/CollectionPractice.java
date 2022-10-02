package com.practice.main;

import com.practice.main.com.practice.beans.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionPractice {
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int max_sum = Integer.MIN_VALUE;
        int [][] mat = new int[6][6];
        int k = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                mat[i][j] = arr.get(i).get(j);
            }
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
             int sum = (mat[i][j] + mat[i][j + 1] +
                        mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] + mat[i + 2][j + 1] +
                                mat[i + 2][j + 2]);
                max_sum = Math.max(max_sum,sum);
            }
        }
        return max_sum;
    }
    public static void main(String args[]) {

        /*HashMap<String, String> hash_map = new HashMap<String, String>();//creating an empty hash map
        //adding key values to the hash map
        hash_map.put("1", "Monday");
        hash_map.put("2", "Tuesday");
        hash_map.put("3", "Wednesday");
        hash_map.put("4", "Thursday");
        hash_map.put("5", "Friday");
        hash_map.put("6", "Saturday");
        hash_map.put("7", "Sunday");
        //printing the original hash map
        System.out.println("The original hash map is as follows : " + hash_map);
        //printing the collection view of the hash map
        System.out.println("Keys = " + hash_map.keySet());
        System.out.println("The collection view is as follows : " + hash_map.values());*/
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employees.add(new Employee("Indra "+i, i*1000*Math.random(),i*100));
        }
        System.out.println("employees = " + employees);
        List<Employee> sortedList = employees.stream().sorted(Comparator.comparingDouble(Employee::getEmpSal).reversed()).collect(Collectors.toList());
        System.out.println("sortedList = " + sortedList);
    }
}
