package com.wtw.util;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Slf4j
public class TicketUtil {

    private static final Random r = new Random();
    private static final int BOUND = 33;

    public static List<Integer> makeTicket() {
        boolean[] book = new boolean[34];
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(BOUND) + 1;
            while (book[num]) {
                num = r.nextInt(BOUND) + 1;
            }
            book[num] = true;
            ans.add(num);
        }

        Collections.sort(ans);
        ans.add(r.nextInt(16) + 1);

        log.info("生成彩票：" + ans);
        return ans;
    }

}
