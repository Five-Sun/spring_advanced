package hello.advanced.trace.threadlocal.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThreadLocalService {

    private ThreadLocal<String> nameStore = new ThreadLocal<>();

    public String logic(String name) {
        log.info("저장 name={} -> nameStore={}", name, nameStore.get());
        nameStore.set(name);
        sleep(1000);
        log.info("조회 nameSotre={}", nameStore.get());
        return nameStore.get();
    }

    private void sleep(int millies) {
        try {
            Thread.sleep(millies);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
