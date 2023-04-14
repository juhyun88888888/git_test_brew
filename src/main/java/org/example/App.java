package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        int count = 1;
        ArrayList<WiseSaying> wiseSayings = new ArrayList<WiseSaying>();

        System.out.println(" == 명언 앱 == ");
        while (true) {
            System.out.println("명령: ");
            String command = sc.nextLine().trim();

            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                long id = count;
                System.out.println("명언: ");
                String content = sc.nextLine().trim();
                System.out.println("작가: ");
                String authorName = sc.nextLine().trim();
                WiseSaying wiseSaying = new WiseSaying(id, content, authorName);
                wiseSayings.add(wiseSaying);
                System.out.println(count + "번 명언이 등록되었습니다.");
                count++;
            } else if (command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("-".repeat(30));
            }
            for (int i = wiseSayings.size() - 1; i >= 0; i--) {
                WiseSaying wiseSaying = wiseSayings.get(i);
                System.out.printf("%d , %s, %s\n", wiseSaying.getId(), wiseSaying.getContent(), wiseSaying.getauthorName());
            }
        }

    }

}

