package com.brainstation23.bank.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ActionCommand<A, O> {

  private A action;

  private O object;
}
