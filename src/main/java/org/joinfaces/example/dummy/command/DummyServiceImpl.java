package org.joinfaces.example.dummy.command;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * DummyServiceの実装クラス。
 * テキストを提供するサービスを実現します。
 *
 * このクラスはSpringの{@code @Service}アノテーションが付与されており、
 * アプリケーションコンテキストで管理されるコンポーネントです。
 */
@Service
public class DummyServiceImpl implements DummyService{
private static final Logger log = LoggerFactory.getLogger(DummyServiceImpl.class);

  /**
   * テキストを取得するメソッド。
   * 現在の日時を含む文字列を返します。
   *
   * @return "Hello from Spring"に現在の日時を加えた文字列
   */
  @Override
  public String getText() {
    log.info("getText");
    return "Hello from Spring: " + LocalDateTime.now();
  }


}
