package com.random;

public class randRule {
    numAndoperator nao = new numAndoperator();
    public String getRightOperatorNum(String operator,String beforeOperatorNumber,int range){
        String rightOperatorNum = null;
        if(operator.equals("")&&(beforeOperatorNumber.equals("0"))){

                rightOperatorNum = nao.getIntegerOperatorNum(range);
                while(true){
                    if(!(rightOperatorNum.equals("0"))){
                        break;
                    }
            }
 /*           rightOperatorNum = nao.getIntegerOperatorNum(range);
            while(true){
                if(!(beforeOperatorNumber.equals("0"))){
                    break;
                }
            }*/
        }else {
            return beforeOperatorNumber;
        }
        return rightOperatorNum;
    }
}
