String checkResult(int mark){

    String result;
    if (mark >= 0 && mark < 40){
        result = "Fails";
    }else if (mark >= 40 && mark < 80){
        result = "Pass";
    }else if (mark >= 80 && mark <= 100){
        result = "Pass with Distinction";
    }else if(mark == 100){
    result = "Perfect Score";
    }else{
        result = "Invalid Mark";
    }
    return result;
}