/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: GameDemo
 * Author:   Administrator
 * Date:     2019-3-27 10:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package map.mapmapdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class GameDemo {
    public static void main(String[] args){
        //组合牌
        HashMap<Integer,String> pooker = new HashMap<>();
        ArrayList<Integer> pookerNumber = new ArrayList<>();
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        String[] colors = {"黑桃","红桃","方块","梅花"};
        int index =2;
        for(String number:numbers){
            for(String color:colors){
                pooker.put(index,color+number);
                pookerNumber.add(index);
                index++;

            }

        }
        //System.out.println(pooker);
        pooker.put(0,"大王");
        pookerNumber.add(0);
        pooker.put(1,"小王");
        pookerNumber.add(1);
        // System.out.println(pooker);
        //洗牌
        Collections.shuffle(pookerNumber);
        // System.out.println(pookerNumber);
        //发牌
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> player4 = new ArrayList<>();
        for(int i= 0;i< pookerNumber.size();i++){
            if(i < 3){
        //player4.add(i);i循环控制变量，要用i得到pookerNumber的值
                player4.add(pookerNumber.get(i));
            }else if(i%3 == 0){
                player1.add(pookerNumber.get(i));
            }else if(i%3 == 1){
                player2.add(pookerNumber.get(i));
            }else if(i%3 ==2){
                player3.add(pookerNumber.get(i));
            }
        }
        //System.out.println(player1);

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        look("A",player1,pooker);
        look("B",player1,pooker);
        look("C",player1,pooker);
        look("D",player1,pooker);

    }
    private static void look(String name,ArrayList<Integer> player,HashMap<Integer,String> pooker){
        for(Integer key:player) {
            String value = pooker.get(key);
            System.out.print(name + " "+value + " ");
        }
        System.out.println();

    }

}