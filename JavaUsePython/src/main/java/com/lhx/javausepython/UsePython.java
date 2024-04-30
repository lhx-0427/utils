package com.lhx.javausepython;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @Author：lihouxiang
 * @Package：com.lhx.javausepython
 * @Date：2024/4/30 10:44
 * @Classname：UsePython
 */
public class UsePython {
    public static  Integer javaUsePyhton(int num){
        try {
            ProcessBuilder builder = new ProcessBuilder("python", "F:\\0430\\demo\\JavaUsePython\\src\\main\\resources\\static\\smallgame.py",String.valueOf(num));
            builder.redirectErrorStream(true);
            Process process = builder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
            String line;
            while ((line = reader.readLine()) != null) {
                // 处理Python输出的每一行数据
                try {
                    int i = Integer.parseInt(line);
                    if(i==1){
                        System.out.println("正确答案  java返回,方法结束");
                        return i;
                    }
                    continue;
                } catch (NumberFormatException e) {
                    System.out.println(line);

                }
            }
            process.waitFor();
            process.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
