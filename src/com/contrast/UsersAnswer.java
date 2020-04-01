package com.contrast;

public class UsersAnswer {
    public static String getUsersAnswer(String[] usersAnswer,String[] rightAnswer){
        String rightAnswerResport = "Correct: ",rightAnswerList = "正确的题号";  //答对题目
        String wrongAnswerResport = "Wrong",wrongAnswerList = "错误的题号";      //答错题目
        int rightNum = 0,wrongNum = 0;                                          //记录正确和错误的个数
        for(int i = 0;i<usersAnswer.length;i++){                                //统计答案
            if(usersAnswer[i].equals(rightAnswer[i])){//答对
                rightNum++;
                rightAnswerList = rightAnswerList+ (i+1)+",";
            }else{//答错
                wrongNum++;
                wrongAnswerList = wrongAnswerList + (i+1) +",";
            }
        }
        rightAnswerResport = rightAnswerResport+rightNum+"-------"+rightNum+"道题正确, "+rightAnswerList+"\n";
        wrongAnswerResport = wrongAnswerResport+wrongNum+"-------"+wrongNum+"道题正确,"+wrongAnswerList+"\n";
        return rightAnswerResport+wrongAnswerResport;
    }

}
