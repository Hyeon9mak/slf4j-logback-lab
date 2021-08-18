package lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LabApplication {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(LabApplication.class);

        for (int count = 0; count < 10; count++) {
            logger.error("에러다 -- {}", count);
            logger.warn("워닝이다 -- {}", count);
            logger.info("인포다 -- {}", count);
            logger.debug("디버그다 -- {}", count);
            logger.trace("트레이스다 -- {}", count);
            // LoggerFactory 등록시 default logging level: DEBUG기 때문에, TRACE는 출력되지 않는다.
        }
    }

    private static void systemPrintLogging() {
        for (int i = 0; i < 10; i++) {
            System.out.println("로깅 재밌냐?");
            System.err.println("에러 재밌냐?");
        }
    }
}
