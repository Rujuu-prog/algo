package com.rujuu.algo.contains_deplicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] OK = {1, 2, 3, 1};
        int[] NG = {1, 2, 3, 4};
        boolean bat_result_ok = bad(OK);
        System.out.println(bat_result_ok);
        boolean bat_result_ng = bad(NG);
        System.out.println(bat_result_ng);
    }
    /**
     * O(n**2)
     * 配列を2つ作成して比較しているため、n*nでO(n**2)になる
     * 計算量多い
     * */
    private static boolean bad(int[] L) {
        for (int i = 0; i < L.length - 1; i++){
            for (int j = i + 1; j < L.length; j++){
                if (L[i] == L[j]){
                    System.out.println(L[i] + " " + L[j]);
                    return true;
                }
            }
        }
        return false;
    }
}
