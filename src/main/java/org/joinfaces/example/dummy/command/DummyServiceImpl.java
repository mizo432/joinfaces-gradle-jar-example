package org.joinfaces.example.dummy.command;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class DummyServiceImpl implements DummyService{
private static final Logger log = org.slf4j.LoggerFactory.getLogger(DummyServiceImpl.class);

  @Override
  public String getText() {
    log.info("getText");
    return "Hello from Spring: " + LocalDateTime.now();
  }


}
