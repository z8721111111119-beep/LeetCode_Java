import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;  


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("王小明", 40000.0);
        List<Attendance> attendance = new ArrayList<>();
        // 範例打卡資料：第一筆有加班，第二筆為正常工時
        attendance.add(new Attendance(LocalDate.of(2026, 7, 1), LocalTime.of(9, 0), LocalTime.of(18, 30)));
        attendance.add(new Attendance(LocalDate.of(2026, 7, 2), LocalTime.of(9, 0), LocalTime.of(17, 0)));

        // 計算月薪並輸出結果
        double salary = SalaryCalculator.calculateSalary(employee, attendance);
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
    private LocalDate date;
    private LocalTime timeStart;
    private LocalTime timeEnd;

    public Attendance(LocalDate date, LocalTime timeStart, LocalTime timeEnd) {
        this.date = date;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public long getTotalHours() {
        // 計算該筆打卡紀錄的工作時數
        return Duration.between(timeStart, timeEnd).toHours();
    }

}

class SalaryCalculator {
    public static double calculateSalary(Employee employee, List<Attendance> attendance) {
        double salary = employee.getMonthlySalary();
        // 以 30 天、每天 8 小時推算時薪
        double hourlyRate = employee.getMonthlySalary() / (30.0 * 8.0);

        for (Attendance record : attendance) {
            long workedHours = record.getTotalHours();
            long overtimeHours = Math.max(0, workedHours - 8);
            // 超過 8 小時的部分，依時薪的 1.5 倍計算加班費
            salary += overtimeHours * hourlyRate * 1.5;
        }

        return salary;
    }
}