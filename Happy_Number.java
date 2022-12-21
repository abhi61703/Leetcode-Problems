class Solution {
    public boolean isHappy(int n) {
    int sum = 0;
    boolean isHappyOrNot=false;
    while(n>0){
        int  temp=n%10;
        sum+=temp*temp;
        n/=10;
    }
    if(sum==1){
        isHappyOrNot=true;
        return isHappyOrNot;
    }
    else if(sum==4){
        isHappyOrNot=false;
        return isHappyOrNot;
    }
    return isHappy(sum);
}    
}
