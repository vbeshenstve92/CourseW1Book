public class Main {

    public static int Counter;
    static Employee employees[] = new Employee[10];  // массив на 10 сотрудников


    public static void main(String[] args) {
//тестовые данные и проверка
        listEmployee(); // проверка метода вывод полного списка полей
        // System.out.println("Сумма зарплат за месяц составила " + monthlySalary() + " $$");


        employees[0] = new Employee("Ivanov", "Ivan", "I", "1", 100D);
        System.out.println("добавлен сотрудник");
        listEmployee(); // проверка метода вывод полного списка полей
        System.out.println("Сумма зарплат за месяц составила " + monthlySalary() + " $$");  // проверка метода вывод Сумма зарплат за месяц
        System.out.println("Среднее зарплат за месяц составила " + salaryAverage() + " $$");  // проверка метода вывод Среднее зарплат за месяц
        System.out.println("Мин зарплата " + employees[employeesMin()] + "$");           // проверка метода вывод сотрудника с мин зарплат за месяц
        System.out.println("Макс зарплата " + employees[employeesMax()] + "$");         // проверка метода вывод сотрудника с Max зарплат за месяц

        employees[1] = new Employee("Petrov", "Petr", "I", "3", 150D);
        employees[2] = new Employee("fgdb", "tui", "L", "3", 1500D);
        employees[3] = new Employee("dukfguk", "gku", "H", "3", 250D);

        System.out.println("добавлен сотрудник");
        listEmployee(); // проверка метода вывод полного списка полей
        System.out.println("Сумма зарплат за месяц составила " + monthlySalary() + " $$"); // проверка метода вывод Сумма зарплат за месяц

        System.out.println("Среднее зарплат за месяц составила " + salaryAverage() + " $$");  // проверка метода вывод Среднее зарплат за месяц

        System.out.println("Мин зарплата " + employees[employeesMin()] + "$");             // проверка метода вывод сотрудника с мин зарплат за месяц
        System.out.println("Макс зарплата " + employees[employeesMax()]  + "$");            // проверка метода вывод сотрудника с Max зарплат за месяц

        listEmployeeFullName(); // проверка метода вывод списка ФИО
//тестовые данные и проверка


    } // конец метода майн

    public static void listEmployee() {
        if (Counter == 0) {
            System.out.println("список сотрудников пуст");
            //throw new IllegalArgumentException("список сотрудников пуст. ");
            return;
        } else {
            for (int i = 0; i < Counter; i++) {
                System.out.println(employees[i]  + "$");
            }

        }
        return;
    }

    public static void listEmployeeFullName() {
        if (Counter == 0) {
            System.out.println("список сотрудников пуст");
            throw new IllegalArgumentException("список сотрудников пуст. ");
            //return;
        } else {
            for (int i = 0; i < Counter; i++) {
                System.out.println(employees[i].toStringFullName() );
            }

        }
        return;
    }

    public static double monthlySalary() {
        double monthlySalary = 0;
        for (int i = 0; i < Counter; i++) {
            monthlySalary = monthlySalary + employees[i].getSalary();
        }
        return monthlySalary;
    }

    public static int employeesMin() {
        if (Counter == 0) {
            System.out.println("список сотрудников пуст.");
            throw new IllegalArgumentException("список сотрудников пуст. ");
            //return 0;
        }
        double summaMin = employees[Counter - 1].getSalary();
        int employeesMin = 0;
        for (int i = 0; i < Counter; i++) {
            if (employees[i].getSalary() < summaMin) {
                summaMin = employees[i].getSalary();
                employeesMin = i;
            }
        }
        return employeesMin;
    }


    public static int employeesMax() {
        if (Counter == 0) {
            System.out.println("список сотрудников пуст.");
            throw new IllegalArgumentException("список сотрудников пуст. ");
            //return 0;
        }
        double summaMax = employees[Counter - 1].getSalary();
        int employeesMax = Counter - 1;
        for (int i = 0; i < Counter; i++) {
            if (employees[i].getSalary() > summaMax) {
                summaMax = employees[i].getSalary();
                employeesMax = i;
            }
        }
        return employeesMax;
    }

    public static double salaryAverage() {
        if (Counter == 0) {
            System.out.println("список сотрудников пуст.");
            //return 0;
        }
        return monthlySalary() / Counter;


    }

}