package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Flight implements PilotCompass {
    private UUID id;
    private Language language;
    private List<Employee> employeeList;

    public Flight(Language language) {
        this.id = UUID.randomUUID();
        this.language = language;
        this.employeeList = new ArrayList<>();
    }

    public boolean areAttendantsSameLanguage(Language language){
        int count = 0;
     for(Employee e : employeeList){
         if(e instanceof FlightAttendant f ){
             if(f.getLanguage() == language){
                 count++;
             }
             if(count == 3){
                 return true;
             }
         }
     }
     return false;
    }
    public boolean isCrewComplete(){
        int pilot = 0;
        int flightAttendant = 0;
        for(Employee e : employeeList){
            if(e.getEmployeeType().equals(EmployeeType.CO_PILOT) || e.getEmployeeType().equals(EmployeeType.CAPTAINT)){
                pilot++;
            }
            if(e.getEmployeeType().equals(EmployeeType.FLIGHT_ATTENDANT)){
                flightAttendant++;
            }
            if(pilot == 2 && flightAttendant == 3 ){
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean hasCompass() {
        int compass = 2;
       for (Employee e : employeeList){
           if(e instanceof Pilot p){
               if(p.isCompassAnalog()){
                  compass++;
               }
               if(compass == 2){
                   return true;
               }
           }

        }
       return false;
    }
}
