package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static int N, K;
    public static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        dp = new int[K+1];
        dp[0] = 1;
        for(int i = 1 ; i <= N; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j = num; j <= K; j++)
                dp[j] += dp[j - num];
        }
        System.out.println(dp[K]);
    }
}
