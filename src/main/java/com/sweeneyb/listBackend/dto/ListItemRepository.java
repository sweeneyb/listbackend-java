package com.sweeneyb.listBackend.dto;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ListItemRepository extends PagingAndSortingRepository<ListItem, Integer> {
}
