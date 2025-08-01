package jungsuck.ch14;

import javax.swing.*;
import java.security.cert.CertPath;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamHardPractice {
    public static void main(String[] args) {



        // 테스트 데이터 생성
        List<Employee> employees = Arrays.asList(
                new Employee("김철수", "개발", 5000, LocalDate.of(2020, 3, 15),
                        Arrays.asList("Java", "Spring", "MySQL")),
                new Employee("이영희", "개발", 6000, LocalDate.of(2019, 7, 20),
                        Arrays.asList("Python", "Django", "PostgreSQL")),
                new Employee("박민수", "마케팅", 4500, LocalDate.of(2021, 1, 10),
                        Arrays.asList("Excel", "PowerPoint", "Google Analytics")),
                new Employee("최지혜", "개발", 7000, LocalDate.of(2018, 11, 5),
                        Arrays.asList("JavaScript", "React", "Node.js")),
                new Employee("정대한", "영업", 4000, LocalDate.of(2022, 6, 1),
                        Arrays.asList("Salesforce", "Excel")),
                new Employee("한소영", "개발", 5500, LocalDate.of(2020, 9, 12),
                        Arrays.asList("Java", "Spring Boot", "AWS"))
        );


        System.out.println("=== 연습 문제들 ===\n");

        // 연습 1: 부서별 평균 연봉 구하기
        System.out.println("1. 부서별 평균 연봉:");
        // 여기에 코드 작성
        Map<String, Double> averageDept = employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingInt(Employee::getSalary)));
        averageDept.forEach((dep, avgSalary) -> System.out.println("부서 : " +dep + ", 평균 임금 : "+avgSalary ));

        System.out.println();

        // 연습 2: 연봉이 5000 이상인 개발자들의 이름을 연봉 내림차순으로 정렬
        System.out.println("2. 고연봉 개발자들 (연봉순):");
        employees.stream()
                .filter(employee ->  employee.getDepartment().equals("개발"))
//                  메서드 참조는 함수 객체이므로 직접 값과 비교할 수 없음
//                .filter((Employee::getDepartment).equals("개발"))
                        .filter(employee -> employee.getSalary() >= 5000)
//                                .sorted(Comparator.comparing((Employee employee) -> employee.getSalary()).reversed())
                                .sorted(Comparator.comparing(Employee::getSalary).reversed().thenComparing(Employee::getDepartment))

                                        .forEach(employee -> System.out.println(employee.getName() + "의 연봉 :  " + employee.getSalary()));


        // 여기에 코드 작성

        System.out.println();

        // 연습 3: 각 부서에서 가장 높은 연봉을 받는 사람 찾기
        System.out.println("3. 부서별 최고 연봉자:");
        Map<String, Optional<Employee>> deptByEmployee = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));


        deptByEmployee.forEach((dept, employee) -> {
            if (employee.isPresent()) {
                Employee emp = employee.get();
                System.out.println(dept + ": " + emp.getName() + " (" + emp.getSalary() + "원)");
            }
        });

        // 여기에 코드 작성

        System.out.println();

        // 연습 4: 모든 직원들이 가진 스킬들을 중복 제거하고 알파벳순으로 정렬
        System.out.println("4. 전체 스킬 목록 (중복제거, 정렬):");
        // 여기에 코드 작성

        System.out.println();

        // 연습 5: 2020년 이후 입사한 직원들 중에서 Java 스킬을 가진 사람들의 정보
        System.out.println("5. 2020년 이후 입사 + Java 스킬 보유자:");
        // 여기에 코드 작성

        System.out.println();

        // 연습 6: 부서별로 그룹화하되, 각 부서 내에서는 입사일 순으로 정렬된 직원 명단
        System.out.println("6. 부서별 직원 명단 (입사일순):");
        // 여기에 코드 작성

        System.out.println();

        // 연습 7: 전체 연봉 총합과 직원 수, 평균 연봉을 한 번에 구하기
        System.out.println("7. 연봉 통계:");
        // 여기에 코드 작성

        System.out.println();

        // 보너스: 가장 복잡한 문제
        System.out.println("보너스. 부서별 스킬 분포 (각 부서에서 가장 많이 보유한 스킬 TOP 3):");
        // 여기에 코드 작성



}





}