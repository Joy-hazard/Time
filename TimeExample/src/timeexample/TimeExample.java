
package timeexample;

class TimeShow{
    private int second;
    private int minute;
    private int hour;
    
    TimeShow(){
        second = 15;
        minute = 19;
        hour = 2;
    }
    
    TimeShow(int a, int b, int c){
        second = a;
        minute = b;
        hour = c;
    }
    TimeShow(TimeShow obj){
        second = obj.second;
        minute = obj.minute;
        hour = obj.hour;
    }
    
    void display(){
        
        System.out.println("Time : "+hour +minute +second);
        
    }
    
}
public class TimeExample {


    public static void main(String[] args) {
        
        TimeShow obj1 = new TimeShow();
        TimeShow obj2 = new TimeShow(9, 15, 45);
        TimeShow obj3 = new TimeShow(obj1);
        
        obj1.display();
        obj2.display();
        obj3.display();
       
    }
    
}
