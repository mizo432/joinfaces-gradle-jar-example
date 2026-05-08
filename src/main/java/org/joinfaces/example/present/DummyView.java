package org.joinfaces.example.present;

import org.joinfaces.example.dummy.command.DummyService;
import org.springframework.stereotype.Component;

/**
 * プレゼンテーション層のコンポーネント。
 *
 * <p>このクラスは、{@code DummyService}を使用して、外部にテキストデータを提供する役割を持ちます。
 * Springの{@code @Component}アノテーションが付与されており、アプリケーション コンテキストから管理されるビューコンポーネントです。
 */
@Component("dummy")
public class DummyView {
  private final DummyService dummyService;

  /**
   * DummyBeanのコンストラクタ。 このコンストラクタは、依存関係である{@link DummyService}を注入します。
   *
   * @param dummyService テキストデータを提供するサービス層の依存。
   */
  public DummyView(DummyService dummyService) {
    this.dummyService = dummyService;
  }

  /**
   * テキストデータを取得します。 このメソッドは、{@link DummyService}からテキストデータを取得して返します。
   *
   * @return サービス層から提供されるテキストデータ
   */
  public String getText() {
    return dummyService.getText();
  }
}
