public Time (int time){
    this.hour = time/60/60;
    this.sec = time%60;
    this.min = time/60%60;
}
