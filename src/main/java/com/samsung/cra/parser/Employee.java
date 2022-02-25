package com.samsung.cra.parser;

public class Employee {
    public String employeeNumber;
    public String name;
    public String cl;
    public String phoneNumber;
    public String birthday;
    public String certi;

    public Employee(String employeeNumber, String name, String cl, String phoneNumber, String birthday, String certi) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.cl = cl;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        this.certi = certi;
    }

    // TODO:    Encapsulation 필요. Instance 생성 후 값 변경은 없는 것으로 가정.

    // TODO:    employeeNumber는 숫자 8자리
    // TODO:    name은 영어 대문자로 FIRST_NAME + " " + LAST_NAME 형식임. (ex. GILDONG HONG)
    // TODO:    cl은 {CL1, CL2, CL3, CL4} 중 하나임.
    // TODO:    phoneNumber는 010-####-#### 형식임 (#: 숫자 0-9, ex. 010-1234-5678)
    // TODO:    birthday는 YYYYMMDD 형식임 (ex. 20000101)
    // TODO:    certi는 {NONE, IM, ADV, PRO, EX} 중 하나임.
    // TODO:    instance 생성 시, 입력 데이터가 유효하지 않으면 Invalid Data Exception 후 저장하지 않고 Skip.
}
