

//User function Template for Java
class Dice_problem{
    static int oppositeFaceOfDice(int N){
        // code here
        int t=0;
        if(N==1)
        t=6;
        else if(N==2)
        t=5;
        else if(N==3)
        t=4;
        else if(N==4)
        t=3;
        else if(N==5)
        t=2;
        else if(N==6)
        t=1;
        
        return t;
    }
}