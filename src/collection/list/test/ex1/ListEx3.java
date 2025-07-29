package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while(true){
            int num = sc.nextInt();
            if(num == 0)break;

            list.add(num);
        }

        System.out.println("입력한 정수의 합계: "+getSum(list));
        System.out.println("입력한 정수의 평균: "+getAvg(list));
    }

    private static double getAvg(List<Integer> list) {
        return (double) getSum(list)/list.size();
    }

    private static int getSum(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        return sum;
    }
}
