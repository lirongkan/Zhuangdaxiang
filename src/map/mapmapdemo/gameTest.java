/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: gameTest
 * Author:   Administrator
 * Date:     2019-3-27 15:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package map.mapmapdemo;

import integerdemo.IntegerDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class gameTest {
    public static void main(String[] args){
        HashMap<Integer,String > pooker = new HashMap<>();
        ArrayList<Integer> pookerNumber = new ArrayList<>();
        String[] numbers ={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        String[] colors = {"黑桃","红桃","方块","梅花"};
        int index =2;
        //组合数字与花色并存到ArrayList和HashMap中,两次循环
        for(int i=0;i< numbers.length;i++){
            for(int j =0;j< colors.length;j++){
                String value =   colors[j]+ numbers[i];
                pooker.put(index,value);
                pookerNumber.add(index);
                index++;

            }

        }
        //System.out.println(pooker);
        pooker.put(0,"大王");
        pookerNumber.add(0);
        pooker.put(1,"小王");
        pookerNumber.add(1);
        //System.out.println(pookerNumber);
        //洗牌
        Collections.shuffle(pookerNumber);
        //创建四个数组存储每个人和底牌的编号
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> player4 = new ArrayList<>();
        //发牌，利用%3
        for(int i =0;i< pookerNumber.size();i++){
            if(i < 3){
                player4.add(pookerNumber.get(i));//添加牌编号第i个元素，而不是直接添加为i==0
            }else if(i % 3 ==0){
                player1.add(pookerNumber.get(i));
            }else if(i % 3 ==1){
                player2.add(pookerNumber.get(i));
            }else if(i % 3 ==2){
                player3.add(pookerNumber.get(i));
            }
        }
        //System.out.println(player2);
        //看牌：先排序，再查表
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(player4);
        look("a",player1,pooker);
        look("b",player2,pooker);
        look("c",player3,pooker);
        look("bottom",player4,pooker);

    }
    public static void look(String name,ArrayList<Integer> player,HashMap<Integer,String> pooker){
        //不用索引，用foreach;查表遍历
        System.out.print (name +" ");
        for(Integer key: player){
            String value = pooker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
    }

}

