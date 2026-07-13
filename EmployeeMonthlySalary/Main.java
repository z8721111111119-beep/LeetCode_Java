import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;  


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("王小明", 40000.0);
        List<Attendance> attendances = new ArrayList<>();
        // 範例打卡資料：第一筆有加班，第二筆為正常工時
        attendances.add(new Attendance(LocalDateTime.of(2026, 7, 1, 9, 0), LocalDateTime.of(2026, 7, 1, 18, 30)));
        attendances.add(new Attendance(LocalDateTime.of(2026, 7, 2, 9, 0), LocalDateTime.of(2026, 7, 2, 17, 0)));

        // 計算月薪並輸出結果
        double salary = SalaryCalculator.calculateSalary(employee, attendances);
        System.out.println(salary);
        
    }
}

class Employee {
    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}

class Attendance{
    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;

    public Attendance(LocalDateTime timeStart, LocalDateTime timeEnd) {
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public long getTotalHours() {
        // 計算該筆打卡紀錄的工作時數
        return Duration.between(timeStart, timeEnd).toHours();
    }

}

class SalaryCalculator {
    public static double calculateSalary(Employee employee, List<Attendance> attendances) {
        double salary = employee.getMonthlySalary();
        // 以 30 天、每天 8 小時推算時薪
        double hourlySalary = employee.getMonthlySalary() / (30.0 * 8.0);

        for (Attendance attendance : attendances) {
            long totalHours = attendance.getTotalHours();
            long overtimeHours = Math.max(0, totalHours - 8);
            // 超過 8 小時的部分，依時薪的 1.5 倍計算加班費
            salary += overtimeHours * hourlySalary * 1.5;
        }

        return salary;
    }
}