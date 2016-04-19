package com.ticketmaster.api.discovery.operation;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = true)
public class SearchAttractionsOperation extends PagedOperation<SearchAttractionsOperation> {

  public SearchAttractionsOperation keyword(String keyword) {
    return withParam("keyword", keyword);
  }

  public SearchAttractionsOperation attractionId(String attractionId) {
    return withParam("attractionId", attractionId);
  }

  public SearchAttractionsOperation attractionId(String... attractionIds) {
    return withCommaSeparatedParam("attractionId", attractionIds);
  }

  @Override
  protected SearchAttractionsOperation getThis() {
    return this;
  }
}