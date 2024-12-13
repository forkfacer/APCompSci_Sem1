public class StepTracker{
    int days; 
    int step; 
    int activeDays; 
    
    public StepTracker(int x){
        step = x; 
    }
    
    public int activeDays(){
        return activeDays; 
    }
    
    public double averageSteps(){
        return (step/days) * 1.0;
    }
    
    public void addDailySteps(int a){
        if(a>10000){
            activeDays++;
        }
        step = step + a; 
        days++;
    }
}