package com.main;

import com.Iofile.IoFile;
import com.caculate.caculExp;
import com.contrast.UsersAnswer;
import com.expression.Expression;
import com.random.randExpression;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        randExpression randexpression = new randExpression(); //生成表达式
        caculExp caculexp = new caculExp();
        String[] expressionArray = null;
        String[] answerArray = null;
        String[] usersAnswer = null;
        Expression[] expressions = null;
        int num,range;
        num = range = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入生成表达式个数：");
        num = scanner.nextInt();
        System.out.println("请输入操作数范围：");
        range = scanner.nextInt();
        expressionArray = new String[num];
        usersAnswer = new String[num];
        expressions = new Expression[num];
        answerArray = new String[num];
        for (int i = 0; i < num; i++){
            Expression e = randexpression.getExpression(range);
            expressions[i] = e;
            caculexp.getExpValue(e);
            if(e.getAnswer() == null){
                i--;
            }else{
                String exp = e.getExpression();
                expressionArray[i] = exp;
                answerArray[i] = e.getAnswer();
            }
        }
//        System.out.println("00000000000000000");
        for (int i = 0; i < num; i++){
            System.out.println("第"+(i+1)+"题：");
            System.out.println(expressionArray[i]+" = "+answerArray[i]);
        }
//        System.out.println("1111111111111111111111");
        IoFile.writeExpression(expressionArray);//将表达式写入文件
        IoFile.writeAnswer(answerArray); //将表达式的答案写入文件.

        System.out.println("已生成题目，请开始答题：\n");
        for(int i=0;i<num;i++){
            System.out.println("第"+(i+1)+"题答案：");
            usersAnswer[i] = scanner.next();
        }
        String contrast= UsersAnswer.getUsersAnswer(usersAnswer,answerArray);
        System.out.println(contrast);
    }
}
