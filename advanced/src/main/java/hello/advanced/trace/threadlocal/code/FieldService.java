package hello.advanced.trace.threadlocal.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FieldService {

    private String nameStore;

    public String logic(String name) {
        log.info("저장 name={} -> nameStore={}", name, nameStore);
        nameStore = name;
        sleep(1000);
        log.info("조회 nameSotre={}", nameStore);
        return nameStore;
    }

    private void sleep(int millies) {
        try {
            Thread.sleep(millies);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
