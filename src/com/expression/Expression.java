package com.expression;

public class Expression {
    private String operatorNum[];//记录操作数
    private String operator[];//记录操作符
    private String answer;
    private String flagExprssion[];//用于查重.
    private int flag = 0; //用于标识该表达式是否重复.

    public String[] getOperatorNum() {
        return operatorNum;
    }

    public void setOperatorNum(String[] operatorNum) {
        this.operatorNum = operatorNum;
    }

    public String[] getOperator() {
        return operator;
    }

    public void setOperator(String[] operator) {
        this.operator = operator;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Expression(){//为方便计算将所有数组初始化为空
        operatorNum = new String[5];
        for (int i=0;i<operatorNum.length;i++){
            operatorNum[i] = null;
        }
        operator = new String[6];
        for (int i=0;i<operator.length;i++){
            operator[i] = null;
        }
        flagExprssion = new String[7];
        for(int i = 0;i<flagExprssion.length;i++){
            flagExprssion[i] = null;
        }
    }

    public String getExpression(){//以字符串返回表达式
        String expression = "";
        int i=0;
        int j=0;
        if(operator[j]!=null) expression+=operator[j];
            j++;
        for(;operatorNum[i]!=null;){
            expression+=operatorNum[i++];
            if(operator[j]!=null){
                expression+=operator[j];
                j++;
            }else{
                break;
            }
        }
        if(operatorNum[i]!=null) expression+=operatorNum[i];
        if(operator[j]!=null) expression+=operator[j];
        return expression;
    }

    public String[] getStringExpression(){
        String[] expression = new String[9];
        int i=0;
        int j=0;
        int k=0;
        if(operator[k]!=null)
            expression[j++]=operator[k];
        k++;
        for(;operatorNum[i]!=null;){
            expression[j++]=operatorNum[i++];
            if(operator[k]!=null){
                if(operator[k].length()>1){
                    expression[j++]=operator[k].substring(0,1);
                    expression[j++]=operator[k].substring(1,2);
                }else{
                    expression[j++]=operator[k];
                }
                k++;
            }else{
                break;
            }
        }
        if(operatorNum[i]!=null) expression[j++]=operatorNum[i];
        if(operator[k]!=null) expression[j++]=operator[k];
        return expression;
    }
}
