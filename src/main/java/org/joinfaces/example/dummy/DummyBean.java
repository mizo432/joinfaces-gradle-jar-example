package org.joinfaces.example.dummy;

import org.joinfaces.example.dummy.service.DummyService;
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
   * Constructs a new instance of {@code DummyBean} and injects the specified {@code DummyService}.
   *
   * @param dummyService The service component used to retrieve textual data. This dependency is
   *     mandatory and is expected to be provided by the Spring Dependency Injection container.
   */
  public DummyBean(DummyService dummyService) {
    this.dummyService = dummyService;
  }

  /**
   * Retrieves a textual message from the underlying {@link DummyService}.
   *
   * @return A string containing the text provided by the service implementation.
   */
  public String getText() {
    return dummyService.getText();
  }
}
