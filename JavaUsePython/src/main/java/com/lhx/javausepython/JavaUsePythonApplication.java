package com.lhx.javausepython;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class JavaUsePythonApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaUsePythonApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个数字");
            int num = scanner.nextInt();
            Integer pyhton = UsePython.javaUsePyhton(num);
            if(pyhton!=null){
                System.exit(0);
            }
        }
    }

}
