import java.util.ArrayList;
public class StepTracker
{
private int minStep;
private int activeDay;
private int tStep;
private int day;

 public StepTracker(int x){
 minStep = x;
 activeDay = 0;
  tStep = 0;
  activeDay = 0;
  
 }
 public void addDailySteps(int s){
  tStep+= s;
  day++;
  if(tStep >= minStep){
   activeDay++;
  }
 }
 public int activeDays(){
  return activeDay;
 }
 public double averageSteps(){
  if(day == 0){
   return 0.0;
  }
  else 
  return (double)tStep/day;
 }
} 
