//1
Amount amount1 = new Amount();
//4
float x;
float y;
public GraphPoint(float x1, float y1){
    super(x1,y1);
    Point point = new Point(x1,y1);
        
}
//2
public Time(int time){
    this.hour = time/60;
    this.min = time%60;
}
//6
public GroundhogDate(){
     this.month = "Feb";
     this.day = 2;
}
//
