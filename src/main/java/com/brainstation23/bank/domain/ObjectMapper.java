package com.brainstation23.bank.domain;

/**
 * Date of creation 16-Feb-2021
 *
 * @author Md. Rezaul Hasan
 * @since 0.0.1
 */
@FunctionalInterface
public interface ObjectMapper<T, R> {
  R map(T object);
}
