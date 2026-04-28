package org.joinfaces.example.present;

import org.joinfaces.example.dummy.command.DummyService;
import org.springframework.stereotype.Component;

/**
 * A Spring-managed component that acts as a wrapper around the {@link DummyService}. This bean
 * interacts with the service layer to provide textual data.
 *
 * <p>The class is annotated with {@code @Component} to make it eligible for Spring's component
 * scanning and dependency injection.
 *
 * <p>Constructor injection is used to ensure that the {@link DummyService} dependency is provided
 * at runtime.
 */
@Component("dummy")
public class DummyBean {
  private final DummyService dummyService;

  /**
   * DummyBeanのコンストラクタ。
   * このコンストラクタは、依存関係である{@link DummyService}を注入します。
   *
   * @param dummyService テキストデータを提供するサービス層の依存。
   */
  public DummyBean(DummyService dummyService) {
    this.dummyService = dummyService;
  }

  /**
   * テキストデータを取得します。
   * このメソッドは、{@link DummyService}からテキストデータを取得して返します。
   *
   * @return サービス層から提供されるテキストデータ
   */
  public String getText() {
    return dummyService.getText();
  }
}
