class Solution {
    public String intToRoman(int num) {
        int m = num / 1000;
        int d = (num%1000)/500;
        int c = (num%500)/100;
        int l = (num%100)/50;
        int x = (num%50)/10;
        int v = (num%10)/5;
        int i = (num%5)/1;
        String answer = "";
        for (int j = 0; j < m;j++){
            answer = answer + "M";
        }


        if ((num % 1000)/100 == 9){
            answer = answer + "CM";
        }else{
            for (int j = 0; j < d;j++){
                answer = answer + "D";
            }
        }
        if (c == 4){
            if ((num % 1000)/100 == 4){
            answer = answer + "CD";
            }
        }
        else{
            for (int j = 0; j < c;j++){
                answer = answer + "C";
            }
        }




        if ((num % 100)/10 == 9){
            answer = answer + "XC";
        }
        else{
            for (int j = 0; j < l;j++){
                answer = answer + "L";
            }
        }
        if (x == 4){
            if ((num % 100)/10 == 4){
            answer = answer + "XL";
            }
        }
        else{
            for (int j = 0; j < x;j++){
                answer = answer + "X";
            }
        }


        if (num % 10 == 9){
            answer = answer + "IX";
        }else{
            for (int j = 0; j < v;j++){
                answer = answer + "V";
            }
        }
        if (i == 4){
            if (num % 10 == 4){
             answer = answer + "IV";
            }
        }
        else{
            for (int j = 0; j < i;j++){
                answer = answer + "I";
            }
        }
        return answer;
    }
}