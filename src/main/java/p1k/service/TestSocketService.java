package p1k.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestSocketService implements ITestSocketService {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Override
    public void handleMessage(String message) {
        LOGGER.error("ahahahahhaahahhahaaha: "+message);
    }
}
