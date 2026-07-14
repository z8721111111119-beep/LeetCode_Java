import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee("James", 50000);
        List<Attendance> attendances = new ArrayList<>();
        attendances.add(new Attendance(LocalDateTime.of(2024, 1, 15, 9, 0), LocalDateTime.of(2024, 1, 15, 18, 0)));
        attendances.add(new Attendance(LocalDateTime.of(2024, 1, 16, 9, 0), LocalDateTime.of(2024, 1, 16, 17, 0)));

        double salary = CalculateSalary.calculate(emp, attendances);
        System.out.println(salary);

    }
}

class Employee {
    private String Name;
    private double MonthlySalary;

    public Employee(String name, double monthlySalary) {
        Name = name;
        MonthlySalary = monthlySalary;
    }

    public String getName() {
        return Name;
    }

    public double getMonthlySalary() {
        return MonthlySalary;
    }
}

class Attendance {
    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;

    public Attendance(LocalDateTime timeStart, LocalDateTime timeEnd) {
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public long getTotalHours(){
        //計算該筆打卡紀錄的工作時數 無條件捨去 
        return Duration.between(timeStart, timeEnd).toHours();
    }
}

class CalculateSalary{
    public static double calculate(Employee emp,List<Attendance> Attendances){
        double salary = emp.getMonthlySalary();
        // 以 30 天、每天 8 小時推算時薪
        double hourlySalary = emp.getMonthlySalary()/(30*8);

        for(Attendance attendance:Attendances){
            // 超過 8 小時的部分，依時薪的 1.5 倍計算加班費
            if(attendance.getTotalHours()>8){
                long overTime = attendance.getTotalHours()-8;
                salary+=overTime*hourlySalary*1.5;
            }
        }
        return salary;
    }
}