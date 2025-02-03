enum Days {
    MON, TUE, WED, THU, FRI, SAT, SUN
}


String checkDayWithExpression(Days day){
    switch(day){
        case MON:
            return "First Day of Week.";
        case TUE, WED, THU:
            return "Week Days.";
        case FRI:
            return "Last day of Weekday.";
        default:
            return "Weekend.";
    }
}


String checkDayWithArrow(Days day){
    return switch(day){
        case MON -> "First Day of Week.";

        case TUE, WED, THU -> "Week Days.";

        case FRI -> "Last day of Weekday.";

        default -> "Weekend.";
    };
}


