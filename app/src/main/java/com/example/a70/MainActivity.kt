package com.example.a70

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(wallpaper: Array<String>): IntArray {
                var answer: IntArray = intArrayOf()
                //#이 있는 인덱스값 [최소,최소],[최대,최대] 를 구하여 각 뺀값 의 절대차 를 구한다
                var min_i = 50
                var min_j = 50
                var max_i = 0
                var max_j = 0

                for(i in wallpaper.indices){
                    for(j in wallpaper[i].indices){
                        if(wallpaper[i][j].equals('#')){
                            if(min_i>=i) min_i = i
                            if(min_j>=j) min_j = j
                            if(max_i<=i) max_i = i+1
                            if(max_j<=j) max_j = j+1
                        }
                    }
                }
                answer = intArrayOf(min_i,min_j,max_i,max_j)
                return answer
            }
        }
        val a = Solution()
        a.solution(arrayOf(".#...", "..#..", "...#."))
        a.solution(arrayOf("..........", ".....#....", "......##..", "...##.....", "....#....."))
        a.solution(arrayOf(".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."))
        a.solution(arrayOf("..", "#."))
    }
}