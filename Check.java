package com.inter;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Check {

    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> map = new HashMap<>();
        int queries_size = queries.size();
        List<Integer> list;
        List<Integer> result = new ArrayList<Integer>();

        for(int i = 0;i < queries_size;i++){
            list = queries.get(0);
            int k = list.get(0);
            int n = list.get(1);

            if(k == 1){
                if(map.containsKey(n)){
                    int count = map.get(n);
                    map.put(n, ++count);
                }else{
                    map.put(n, 1);
                }
            }else if(k == 2){
                int count = map.get(n);
                map.put(n, --count);
            }else{
                boolean flag = false;
                for(int value : map.values()){
                    if(value == n){
                        result.add(1);
                        flag = true;
                        break;
                    }
                }
                result.add(0);
                System.out.println(flag ? "1" : "0");
            }
        }
        return result;

    }

    public static void main(String[] args) throws IOException {
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // int q = Integer.parseInt(bufferedReader.readLine().trim());
    	Scanner sc = new Scanner(System.in);
    	int q = sc.nextInt();

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
           // String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        	String[] queriesRowTempItems = sc.nextLine().split(" ");
            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 2; j++) {
            	String sb = queriesRowTempItems[j];
                int queriesItem = Integer.parseInt(sb);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> ans = freqQuery(queries);

        for(int i = 0;i < ans.size();i++) {
        	System.out.println(ans.get(i));
        }
//        for (int i = 0; i < ans.size(); i++) {
//            bufferedWriter.write(String.valueOf(ans.get(i)));
//
//            if (i != ans.size() - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

